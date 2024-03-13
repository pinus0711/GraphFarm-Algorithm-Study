package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4779_칸토어_집합 {

	private static int N;
	private static String str;
	private static BufferedReader br;
	private static int len;
	private static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		while((str = br.readLine()) != null) {
			N = Integer.parseInt(str);
			len = (int)Math.pow(3, N);
			sb = new StringBuilder();
			for(int i=0; i<len; i++) {
				sb.append("-");
			}
			can(0, len);
			System.out.println(sb);
		}

	}
	
	private static void can(int start, int size) { // start : 시작 인덱스
		if(size == 1){
			return;
		}
		int newSize = size/3;
		// 3등분한 문자열의 중간 부분을 공백 처리
		for(int i=start+newSize; i<start+2*newSize; i++) {
			sb.setCharAt(i, ' ');
		}
		can(start, newSize);
		can(start+newSize*2, newSize);
	}
}
