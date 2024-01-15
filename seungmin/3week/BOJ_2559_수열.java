package study;

import java.util.Scanner;

// BOJ. 2559번: 수열
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 전체 날짜의 수
		int k = sc.nextInt(); // 연속적인 날짜의 수
		
		int[] array = new int[n];
		
		for (int idx=0; idx<n; idx++) {
			array[idx] = sc.nextInt();
		}
		
		int[] prefix_sum = new int[n+1];
		
		for (int idx=0; idx<n; idx++) {
			prefix_sum[idx+1] = prefix_sum[idx] + array[idx]; 
		}
		
		// k는 1과 n 사이의 정수이다.
		// k가 2라면, 0~2 / 1~3 / 2~4 구간합의 결과를 저장해야하는 것
		// -> 2까지의 구간합
		// -> 3까지의 구간합 - 0까지의 구간합
		// -> 4까지의 구간합 - 1까지의 구간합 .. 을 저장하는 배열의 요소에서 최댓값을 구하기
		
		// k가 n보다 큰 경우에 대한 예외처리 추가
		int solutionLength = Math.max(0, n - k + 1);
		int[] solution = new int[solutionLength];

		for (int idx = 0; idx < solutionLength; idx++) {
		    solution[idx] = prefix_sum[idx + k] - prefix_sum[idx];
		}
		
		int max = Integer.MIN_VALUE;
		for (int idx : solution) {
			max = Math.max(max, idx);
		}
		
		System.out.println(max);


		
		sc.close();
	}

}