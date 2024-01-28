package codingTest;

import java.util.HashMap;

public class PGS_완주하지_못한_선수 {

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
//		// 1. 배열 Sort 이용
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//		
//		System.out.println(Arrays.toString(participant));
//		System.out.println(Arrays.toString(completion));
//		
//		for(int i=0; i<completion.length; i++) {
//			if(participant[i].equals(completion[i])) {
//				continue;
//			} else {
//				
//				System.out.println(participant[i]);
//				return;
//			}
//		}
//		System.out.println(participant[participant.length-1]);
		
		// 2. HashMap 이용
		
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
		
		for(String player : participant) {
			hm.put(player, hm.getOrDefault(player, 0)+1);
		}
		for(String player : completion) {
			hm.put(player, hm.get(player)-1);
		}
		
		for(String key : hm.keySet()) {
			if (hm.get(key) != 0) {
				answer = key;
			}
		}
		System.out.println(answer);
		
	}

}
