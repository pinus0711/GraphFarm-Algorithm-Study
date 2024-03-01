package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_18353_병사_배치하기 {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	private static int N;
	private static int[] dp;
	private static ArrayList<Integer> list = new ArrayList<Integer>(); // 입력값을 받고 역으로 정렬하기 위해 ArrayList 선언
	
	public static void main(String[] args) throws IOException {
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		dp = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.reverse(list); 
		// 가장 긴 증가하는 부분 수열(Longest Increasing Subsequence, LIS)을 사용하기 위해 dp 배열의 모든 원소를 1로 초기화. 
		// LIS에서 초기 상태의 원소는 모두 1이다.
		Arrays.fill(dp, 1); 
		
		for(int i=1; i<N; i++) {
			for(int j=0; j<i; j++) { // 현재 원소가 i일 때 j<i 인 '모든' j를 다 돌면서 증가하는 부분 수열의 길이를 구한다.
				if(list.get(j) < list.get(i)) {
					dp[i] = Math.max(dp[i], dp[j]+1); // LIS 구하기
				}
			}
		}
		int max = 0;
		for(int i=0; i<N; i++) {
			max = Math.max(dp[i], max); // LIS의 길이 구하기. 
		}
		System.out.println(N - max); // 열외해야 하는 병사의 수를 구해야 하므로 N에서 max를 뺀다.

	}

}
