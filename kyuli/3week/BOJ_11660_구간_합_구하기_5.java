
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11660_구간_합_구하기_5 {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;
	
	public static void main(String[] args) throws Exception{
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] mat = new int[n][n];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				mat[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int[][] prefixSum = new int[n+1][n+1];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				prefixSum[i][j] = prefixSum[i-1][j] + prefixSum[i][j-1] 
						          + mat[i-1][j-1] - prefixSum[i-1][j-1];
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int ans = prefixSum[x2][y2]-prefixSum[x2][y1-1]-prefixSum[x1-1][y2]+prefixSum[x1-1][y1-1];
			sb.append(ans + "\n");
		}
		System.out.print(sb);
	}
}
