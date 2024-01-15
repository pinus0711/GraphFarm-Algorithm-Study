package study;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] array = new int[n];
		
		for (int idx=0; idx<n; idx++) {
			array[idx] = sc.nextInt();
		}
		
		int[] prefix_sum = new int[n+1];
		prefix_sum[0] = 0;
		
		for (int idx=0; idx<n; idx++) {
			prefix_sum[idx+1] = prefix_sum[idx] + array[idx]; 
		}
		
		int[] solution = new int[m];
		
		for (int idx=0; idx<m; idx++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			solution[idx] = prefix_sum[j] - prefix_sum[i-1];
		}

		for (int idx=0; idx<m; idx++) {
			System.out.println(solution[idx]);
		}
		
		sc.close();
	}

}
