package codingTest;

import java.util.Collections;
import java.util.PriorityQueue;

public class PGS_프로세스 {

	public static void main(String[] args) {
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int cnt = 0;
		
		for(int n:priorities) {
			pq.add(n);
		}
		
		while(!pq.isEmpty()) {
			for(int i=0; i<priorities.length; i++) {
				if(pq.peek() == priorities[i]) {
					pq.poll();
					cnt++;
					if(i == location) {
//						return cnt;
					}
				}
			}
		}
		
		
		
	}

}
