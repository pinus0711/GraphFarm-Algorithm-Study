import java.io.*;
import java.util.*;

public class Main {
    static int[] arr,visited,printArr;
    static int n,r;
    static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        r=sc.nextInt();

        arr=new int[n];
        printArr=new int[r];
        visited=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        backTracking(0);
        System.out.println(sb);
    }

    static void backTracking(int depth){
        if(depth==r){
            for(int a:printArr){
                sb.append(a+" ");
            }
            sb.append("\n");
            return;
        }
        int before=-1;
        for(int i=0;i<n;i++){
            if(visited[i]==1)continue;
            if(before==arr[i])continue;
            if(depth>0&&printArr[depth-1]>arr[i])continue;
            visited[i]=1;
            printArr[depth]=arr[i];
            before=arr[i];
            backTracking(depth+1);
            visited[i]=0;
        }
    }
}
