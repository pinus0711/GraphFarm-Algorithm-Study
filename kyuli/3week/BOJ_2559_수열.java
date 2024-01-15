import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2559_수열 {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;
	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int val = Integer.parseInt(st.nextToken());
			arr[i] = val;
		}
		
		int s=0, cmp=0, max=0, sum=0;
		for(int i=0; i<k; i++) {
			sum += arr[i];
		}
		
		max = sum;

		for(int i=k; i<n; i++) {
			cmp = sum - arr[s] + arr[i];
			max = Math.max(max, cmp);
			sum = cmp;
			s++;
		}

		System.out.println(max);
		
	}
}
