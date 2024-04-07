import java.util.*;
import java.io.*;
 
public class Main {	
	static int[][] map;
	static int[][] visited;	
	static int[] dx= {1,-1,0,0};
	static int[] dy= {0,0,1,-1};
	static int n,m;
	static int sx,sy;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		map=new int[n][m];
		visited=new int[n][m];
		for(int i=0;i<n;i++) {	//map 입력
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
				if(map[i][j]==2) {
					sx=i;
					sy=j;  //시작점 저장
					visited[i][j]=1;  //방문처리
				}
				if(map[i][j]==0)visited[i][j]=1;  //0도 방문처리
			}
		}
		graph();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(map[i][j]==0)
					System.out.print(0+" ");
				else
					System.out.print((map[i][j]-2)+" ");  //2로 시작했으니까 2빼줌
			}
			System.out.println("");
		}
	}
	
	public static void graph() {
		Queue<Node> que=new LinkedList<>();
		que.offer(new Node(sx,sy));
		while(!que.isEmpty()) {
			Node node=que.poll();
			for(int i=0;i<4;i++) {
				int nx=node.x+dx[i];
				int ny=node.y+dy[i];
				if(nx>=0&&nx<n&&ny>=0&&ny<m) {
					if(visited[nx][ny]==0) {
						map[nx][ny]=map[node.x][node.y]+1;
						visited[nx][ny]=1;
						que.offer(new Node(nx,ny));
					}
				}
			}
		}
	}
	static class Node {
		public int x,y;
		public Node(int x,int y) {
			this.x=x;
			this.y=y;
		}
	}
}



