package codingTest;
// 스택 수열
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_1874 {
	
	
	private static int temp = 1; // 오름차순으로 스택에 넣을 수
	private static StringBuilder sb = new StringBuilder();
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int total = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<>();
		
		for(int i=1; i<=total; i++) { // 입력 받은 횟수만큼 반복
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken()); 
			
			for(; temp<=num; temp++) {
				stack.push(temp);
				sb.append('+').append('\n');
			}
			if(stack.peek()==num) {
				stack.pop();
				sb.append('-').append('\n');
			} else {
				System.out.println("NO");
				return;
			}
		}
		System.out.println(sb);
		
	}

}
