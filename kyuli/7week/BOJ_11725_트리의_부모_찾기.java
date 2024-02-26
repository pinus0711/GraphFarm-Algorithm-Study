package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_11725_트리의_부모_찾기 {
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	private static StringBuilder sb = new StringBuilder();
	private static int n;
	private static List<Integer>[] arr;
	private static boolean visited[];
	private static int parent[];
	
	public static void DFS(int v) {
		visited[v] = true;
		for(int i : arr[v]) {
			if(!visited[i]) {
				parent[i] = v;
				DFS(i);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n+1];
		visited = new boolean[n+1];
		parent = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		
		for(int i=1; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			arr[s].add(e);
			arr[e].add(s);
		}
		
		DFS(1);
		
		for(int i=2; i<=n; i++) {
			sb.append(parent[i] + "\n");
		}
		System.out.println(sb); 
			
	}

}
