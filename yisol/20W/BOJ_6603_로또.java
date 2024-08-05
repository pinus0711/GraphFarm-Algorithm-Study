import java.io.*;
import java.util.*;

public class Main{
    static int[] S;
    static int K;
    static boolean[] visited;
    static int[] printArr;
    static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


        while(true) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            K=Integer.parseInt(st.nextToken());
            if(K==0) break;
            S=new int[K];
            visited=new boolean[K];
            for(int i=0;i<K;i++) {
                S[i]=Integer.parseInt(st.nextToken());
            }
            printArr=new int[6];
            Lotto(0,0);
            System.out.println(sb);
            sb=new StringBuilder();
        }

    }

    static void Lotto(int start,int depth) {
        if(depth==6) {
            for(int n:printArr) {
                sb.append(n).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=start;i<K;i++) {
            if(!visited[i]) {
                visited[i]=true;
                printArr[depth]=S[i];
                Lotto(i+1,depth+1);
                visited[i]=false;
            }
        }
    }
}
