package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 이코테_효율적인_화폐_구성 {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	private static int N;
	private static int M;
	public static void main(String[] args) throws IOException{
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[] d = new int[M+1];
		Arrays.fill(d, 10001); // M의 최댓값이 10000. M이 될 수 없는 숫자 10001을 넣는다.
		d[0] = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=arr[i]; j<=M; j++) { // 이해 잘 안 됨.. 직접 arr, d 배열 그려서 해야 함.
				if(d[j - arr[i]] != 10001) {
					d[j] = Math.min(d[j], d[j-arr[i]]+1);
				}
			}
		}
		// 최종 M값 확인.
		if(d[M] == 10001) {
			System.out.println("-1");
		} else {
			System.out.println(d[M]);
		}
		
		
	}

}
