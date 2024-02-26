package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2167_2차원_배열의_합 {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	private static StringBuilder sb = new StringBuilder();
	private static int N;
	private static int M;
	private static int K;
	private static int i;
	private static int j;
	private static int x;
	private static int y;
	private static int[][] arr;
	private static int sum = 0;
	private static int temp;
	
	public static void main(String[] args) throws IOException{
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N+1][M+1];
		
		for(int a=1; a<=N; a++) {
			st = new StringTokenizer(br.readLine());
			for(int b=1; b<=M; b++) {
				arr[a][b] = Integer.parseInt(st.nextToken());
			}
		}
		
		K = Integer.parseInt(br.readLine());
		
		for(int z=0; z<K; z++) {
			sum = 0;
			st = new StringTokenizer(br.readLine());
			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			
			while(j <= y) {
				temp = i;
				while(temp <= x) {
					sum += arr[temp][j];
					temp++;
				}
				j++;
			}
			sb.append(sum).append('\n');
		}
		System.out.println(sb);
		
		
	}

}
