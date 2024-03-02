// N과 M (8)
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_15657 {
	
	private static int n, m;
	private static int[] nums;
	private static int[] arr;
	private static StringBuilder sb = new StringBuilder();
	
	private static void repeatedCombinate(int depth, int start) {
		if(depth == m) {
			for(int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=start; i<=n; i++) {
			arr[depth] = nums[i];
			repeatedCombinate(depth+1, i);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		nums = new int[n+1];
		arr = new int[m];
		
		for(int i=0; i<n; i++) {
			nums[i+1] = sc.nextInt();
		}
		
		Arrays.sort(nums);
		repeatedCombinate(0, 1);
		System.out.println(sb);
		
	}

}
