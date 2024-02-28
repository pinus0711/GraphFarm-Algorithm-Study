package ch10;

import java.io.*;
import java.util.*;

public class baekjun {
	//최단거리 미로탈출-bfs
	static class Node{
		int x,y;
		public Node(int x,int y) {
			this.x=x;
			this.y=y;
		}
	}
	
	static int[][] map;
	static int[][] dist;
	static int[] dx= {-1,1,0,0};
	static int[] dy= {0,0,-1,1};
	static int N,M;

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		map=new int[N][M];
		dist=new int[N][M];

		
		for(int s=0;s<N;s++) {
			String str=br.readLine();
			for(int k=0;k<M;k++) {
				map[s][k]=str.charAt(k)-'0';  //숫자로 바꿔주기
			}
		}
        bfs(new Node(0,0));
        System.out.println(dist[N-1][M-1]);
	}
	

	static void bfs(Node n) {
		Queue<Node> que=new LinkedList<>();
		que.offer(n);
		dist[0][0]=1;
		while(!que.isEmpty()) {
			Node node=que.poll();
			for(int i=0;i<4;i++) {
				int cx=node.x+dx[i];
				int cy=node.y+dy[i];
				if(cx>=0&&cx<N&&cy>=0&&cy<M) {
					if(map[cx][cy]==1) {
						que.offer(new Node(cx,cy));
						map[cx][cy]=0;  //방문처리
						dist[cx][cy]=dist[node.x][node.y]+1;  //각자 거리 계속 계산가능
					}
				}
			}
		}
		
	}

	
}
