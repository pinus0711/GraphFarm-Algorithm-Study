package codingTest;
// N과 M (6)
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_11655 {
	
	private static int n, m;
	private static int[] nums;
	private static int[] arr;
	private static StringBuilder sb = new StringBuilder();
	
	private static void combinate(int depth, int start) {
		if(depth == m) {
			for(int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i = start; i<=n; i++) {
			arr[depth] = nums[i];
			combinate(depth+1, i+1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		nums = new int[n+1];
		arr = new int[m];
		
		sc.nextLine();
		for(int i=1; i<=n; i++) {
			nums[i] = sc.nextInt();
		}
		
		Arrays.sort(nums);
		combinate(0, 1);
		System.out.println(sb);
		
	}

}
