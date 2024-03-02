package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이코테_1로_만들기 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	private static int X;
	private static int cnt;
	
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());	
		X = Integer.parseInt(st.nextToken());
		
		int[] d = new int[30001];
		for(int i=2; i<=X; i++) {
			d[i] = d[i-1] + 1;
			if(i % 2 == 0) {
				d[i] = Math.min(d[i], d[i/2] + 1);
			}
			if(i % 3 == 0) {
				d[i] = Math.min(d[i],  d[i/3] + 1);
			}
			if(i % 5 == 0 ) {
				d[i] = Math.min(d[i],  d[i/5] + 1);
			}
		}
		System.out.println(d[X]);
	}

}
