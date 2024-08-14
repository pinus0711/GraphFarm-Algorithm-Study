import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());

        int[][] graph=new int[N][N];
        int[][] result=new int[N][N];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                graph[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        LinkedList<Integer> que=new LinkedList<>();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(graph[i][j]==1){
                    result[i][j]=1;
                    que.offer(j);
                    while(!que.isEmpty()){
                        int n=que.poll();
                        for(int k=0;k<N;k++){
                            if(graph[n][k]==1&&result[i][k]==0){  //무한방문 방지 & 인접리스트 방문
                                result[i][k]=1;  //방문처리
                                que.offer(k);
                            }
                        }
                    }

                }
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}
