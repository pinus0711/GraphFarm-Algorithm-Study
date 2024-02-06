package codingTest;

import java.util.HashMap;

public class PGS_의상 {

	public static void main(String[] args) {

		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
	
		
		HashMap<String, Integer> hm = new HashMap<>();
		int answer = 1;
		for(String[] cloth : clothes) {
			hm.put(cloth[1], hm.getOrDefault(cloth[1], 0)+1);
		}
		
		for(String key : hm.keySet()) {
			answer *= (hm.get(key)+1);
		}
		answer -= 1;
		
		System.out.println(answer);
	}

}
