package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PGS_기능개발 {

	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		
		int len = progresses.length;
		int[] progressesz = new int[len+1];
		for(int i=0; i<len; i++) {
			progressesz[i] = progresses[i];
		}
		List<Integer> list = new ArrayList<>();
		int cnt = 0;
		int ptr = 0;
		
		
		while(ptr != len) {
			if(progressesz[ptr] < 100) {
				for(int i=ptr; i<len; i++) {
					progressesz[i] += speeds[i];
				}
				continue;
			} else if(progressesz[ptr] >= 100 && progressesz[ptr+1] >= 100) {
				cnt++;
				ptr++;
			} else if(progressesz[ptr] >= 100 && progressesz[ptr+1] < 100) {
				cnt++;
				list.add(cnt);
				cnt = 0;
				ptr++;
			}
		}
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		System.out.println(Arrays.toString(answer));
	}

}
