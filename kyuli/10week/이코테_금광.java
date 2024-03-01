package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 이코테_금광 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	private static StringBuilder sb = new StringBuilder();
	private static int T;
	private static int n;
	private static int m;
	private static int[][] dp;

	public static void main(String[] args) throws IOException {

		st = new StringTokenizer(br.readLine());
		T = Integer.parseInt(st.nextToken());
		
		for(int t = 0; t < T; t ++) {
			
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			// dp[i][j]에서 왼쪽 아래의 값을 구할 때 (dp[i+1][j-1]) ArrayIndexOutOfBoundsException가 나지 않도록 n+2 크기의 배열 선언
			dp = new int[n+2][m+1]; 
			for(int i=1; i<=n; i++) { // dp matrix를 입력받은 값으로 초기화
				for(int j=1; j<=m; j++) {
					dp[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			for(int j = 1; j <= m; j++) {
				for(int i = 1; i <=n; i++) {
					// [i][j]에서 왼쪽 위의 값, 왼쪽의 값, 왼쪽 아래의 값 중 가장 큰 값을 dp[i][j]에 더한다
					dp[i][j] += Math.max(Math.max(dp[i-1][j-1], dp[i][j-1]), dp[i+1][j-1]);
				}
			}
			
			int max = 0;
			for(int i=1; i<=n; i++) {
				max = Math.max(max, dp[i][m]);
			}
			sb.append(max).append('\n');
		}
		
		System.out.println(sb);
		
	}

}
