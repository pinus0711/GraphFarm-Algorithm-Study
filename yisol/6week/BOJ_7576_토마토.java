package ch10;

import java.util.*;
import java.io.*;

public class baekjun {

	static int[][] box;
	static Queue<Point> que=new LinkedList<>();
	static int M,N;
	static int ans;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	
	static class Point{
		int x,y,day;
		public Point(int x,int y,int day) {
			this.x=x;
			this.y=y;
			this.day=day;
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		M=Integer.parseInt(st.nextToken());
		N=Integer.parseInt(st.nextToken());
		box=new int[N][M];
		int counting_zero=0;
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				box[i][j]=Integer.parseInt(st.nextToken());
				if(box[i][j]==1)  // 익은 토마토를 큐에 넣기(초기 설정)
					que.offer(new Point(j,i,0));
				if(box[i][j]==0)
					counting_zero++;
			}
		}
		int result=bfs();
		
		if(result==counting_zero)
			System.out.println(ans);
		else
			System.out.println(-1);
       }
	
	static int bfs() {
		int cnt_zero=0;
		while(!que.isEmpty()) {
			for(int k=0;k<que.size();k++) {  //큐에 들어있는익은 토마토만큼 돌면서 확장
				Point p=que.poll();
				ans=p.day;
				for(int i=0;i<4;i++){
					int nx=p.x+dx[i];
					int ny=p.y+dy[i];
					if(nx>=0&&nx<M&&ny>=0&&ny<N) {
						if(box[ny][nx]==0) {
							que.offer(new Point(nx,ny,ans+1));  //원래 day에서 1 증가 시키면서 노드 추가
							box[ny][nx]=1;
							cnt_zero++;
					}
				}
			
			}
			}
			
		}
		return cnt_zero;
	}
	
}
