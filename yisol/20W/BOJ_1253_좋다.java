import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int[] arr=new int[N];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int answer=0;
        Arrays.sort(arr);
        for(int i=0;i<N;i++){
            int start=0;
            int end=N-1;
            while(start<end){
                if(start==i)start++;
                else if(end==i)end--;
                else{
                    int temp=arr[start]+arr[end];

                    if(temp<arr[i])start++;
                    else if(temp>arr[i])end--;
                    else if(temp==arr[i]){
                        answer++;
                        break;
                    }
                }

            }
        }

        System.out.println(answer);
    }
}
