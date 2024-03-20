package ch10;
import java.util.*;
import java.io.*;
 
public class baekjun {
	static int[][] map;
	static int[][] visited;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	static int N;
	static int answer=0;
	static int RGanswer=0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		N=Integer.parseInt(br.readLine());
		map=new int[N][N];
		visited=new int[N][N];
		
		for(int i=0;i<N;i++) {
			String str=br.readLine();
			for(int j=0;j<N;j++) {
				map[i][j]=str.charAt(j);
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(visited[i][j]==0) {
					dfs(j,i);
					answer++;
				}
			}
		}
		String s=answer+" ";
		visited=new int[N][N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(visited[i][j]==0) {
					RGdfs(j,i);
					RGanswer++;
				}
			}
		}
		s+=RGanswer;
		System.out.println(s);
	}
	
	static void dfs(int x,int y) {
		for(int i=0;i<4;i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			if(nx>=0&&nx<N&&ny>=0&&ny<N) {
				if(map[y][x]==map[ny][nx]&&visited[ny][nx]==0) {
					visited[ny][nx]=1;
					dfs(nx,ny);
				}
			}
		}
	}
	
	static void RGdfs(int x,int y) {
		if(map[y][x]=='B') {
			dfs(x,y);
			return;
		}
			
		for(int i=0;i<4;i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			if(nx>=0&&nx<N&&ny>=0&&ny<N) {
				if(map[ny][nx]!='B'&&visited[ny][nx]==0) {
					visited[ny][nx]=1;
					RGdfs(nx,ny);
				}
				if(map[y][x]==map[ny][nx]&&visited[ny][nx]==0) {
					visited[ny][nx]=1;
					RGdfs(nx,ny);
				}
			}
		}
	}

	}

