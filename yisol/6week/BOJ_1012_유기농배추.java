package Baekjun;
import java.util.*;
import java.io.*;
 
public class Main {
	static int N,M;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
	static int[][] map;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		String str="";
		
		int T=Integer.parseInt(st.nextToken());
		for(int i=0;i<T;i++) {
			st=new StringTokenizer(br.readLine());
			M=Integer.parseInt(st.nextToken());
			N=Integer.parseInt(st.nextToken());
			int K=Integer.parseInt(st.nextToken());
			map=new int[M][N];
			int answer=0;  //테스트케이스마다 배추 묶음 초기화
			
			for(int s=0;s<K;s++) {
				st=new StringTokenizer(br.readLine());
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st.nextToken());
				map[a][b]=1;
			}
			
			for(int j=0;j<M;j++) {
				for(int l=0;l<N;l++) {
					if(map[j][l]==1) {  //1만나면 배추 묶음 탐색
						answer+=bfs(j,l);
					}
				}
			}
			System.out.println(answer);
		}
	}
	
	static int bfs(int x,int y) {
		Queue<Point> que=new LinkedList<>();
		que.offer(new Point(x,y));
		
		while(!que.isEmpty()) {
			Point p=que.poll();
			for(int i=0;i<4;i++) {
				int nx=p.x+dx[i];
				int ny=p.y+dy[i];
				if(nx>=0&&nx<M&&ny>=0&&ny<N){
					if(map[nx][ny]==1) {
						map[nx][ny]=0;  //배추 방문 처리
						que.offer(new Point(nx,ny));
					}
				}
			}
		}
		return 1;  //1리턴해서 묶음 증가시키기
	}
	static class Point{
		int x,y;
		public Point(int x,int y) {
			this.x=x;
			this.y=y;
		}
	}
}



