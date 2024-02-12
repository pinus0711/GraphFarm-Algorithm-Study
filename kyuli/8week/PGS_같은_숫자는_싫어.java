package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PGS_같은_숫자는_싫어 {

	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=0; i<arr.length; i++) {
			q.add(arr[i]);
		}
		
		List<Integer> list = new ArrayList<>();
		int num = 0;
		
		list.add(q.poll());
		
		for(int i=1; i<arr.length; i++) {
			num = q.poll();
			if(list.get(list.size()-1) == num) {
				continue;
			} else {
				list.add(num);
			}
		}
		
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		System.out.println(Arrays.toString(answer));
		
	}

}
