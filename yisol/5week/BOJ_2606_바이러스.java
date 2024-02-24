package ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjun {
	
	static int N,E;
	static int[][] graph;
	static boolean[] visited;
	static int cnt=0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        
        N=Integer.parseInt(st.nextToken()); 
        
        st=new StringTokenizer(bf.readLine()); 
        E=Integer.parseInt(st.nextToken());
        
        graph=new int[N+1][N+1];
        visited=new boolean[N+1];
        
        visited[0]=false;
        
        for(int i=0;i<E;i++) {
        	st=new StringTokenizer(bf.readLine());
        	int a=Integer.parseInt(st.nextToken());
        	int b=Integer.parseInt(st.nextToken());
        	graph[a][b]=graph[b][a]=1;
        }
        
        dfs(1);
        System.out.println(cnt-1);
	}
	

	static void dfs(int v) {
		visited[v]=true;
		cnt++;
		for(int i=1;i<=N;i++) {
			if(!visited[i]&&graph[v][i]!=0) {
				dfs(i);
			}
		}
	}

}
