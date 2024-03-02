package codingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 요세푸스 문제
public class BOJ_1158 {
	private static int N;
	private static int K;
	private static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=1; i<=N; i++) {
			q.offer(i);
		}
		
		sb.append("<");
		
		while(q.size() != 1) {
			for(int i=0; i<K-1; i++) {
				q.offer(q.poll());
			}
			sb.append(q.poll()).append(", ");
		}
		sb.append(q.poll()).append(">");
		System.out.println(sb);
	}

}
