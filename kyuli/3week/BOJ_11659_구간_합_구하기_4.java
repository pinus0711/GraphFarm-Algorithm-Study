import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11659_구간_합_구하기_4 {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;
	public static void main(String[] args) throws Exception{
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// prefixSum 배열 만들기
		int[] prefixSum = new int[n+1];
		for(int i=0; i<n; i++) {
			prefixSum[i+1] = prefixSum[i] + arr[i];
		}
		
		for(int z=0; z<m; z++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			System.out.println(prefixSum[j]-prefixSum[i-1]);
		}			
	}

}
