import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjun {
	
	static int N,M;
    static StringBuilder sb=new StringBuilder();
    static boolean[] visitedDFS;
    static boolean[] visitedBFS;
    static int[][] graph;
    static LinkedList<Integer> que=new LinkedList<>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        int v=Integer.parseInt(st.nextToken());
        
        visitedDFS=new boolean[N+1];
        graph=new int[N+1][N+1];
        visitedBFS=new boolean[N+1];
        
        for(int i=0;i<M;i++){
            st=new StringTokenizer(bf.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            
            graph[a][b]=graph[b][a]=1;
            
        }
        
        dfs(v);
        
        System.out.println(sb);
        
        bfs(v);
        System.out.println(sb);
        
	}
	
	static void dfs(int v){
        visitedDFS[v]=true;
        sb.append(v+ " ");
        for(int i=1;i<=N;i++){
            if(graph[v][i]!=0&&!visitedDFS[i]){
                visitedDFS[i]=true;
                dfs(i);
            }
        }
    }
	
	static void  bfs(int v) {
		sb.setLength(0);
		que.offer(v);
		visitedBFS[v]=true;
		while(!que.isEmpty()) {
			int n=que.poll();
			sb.append(n+ " ");
			for(int i=1;i<=N;i++) {
				if(!visitedBFS[i]&&graph[n][i]!=0) {
					que.offer(i);
					visitedBFS[i]=true;
				}
			}
		}
	}

}
