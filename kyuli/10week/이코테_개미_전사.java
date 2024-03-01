package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이코테_개미_전사 {
	// 테케가 1개라 한 개는 맞췄는데 다른 테케까지 맞췄는지 확신은 없음.
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	private static int N;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N+3];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<N+1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int i=1;
		int sum = 0;
		
		while(i < N+1) {
			if(arr[i] < arr[i+1]) {
				sum += arr[i+1];
				i += 3;
			} else {
				sum += arr[i];
				i += 2;
			}
		}
		System.out.println(sum);
		
		
		
		
	}

}
