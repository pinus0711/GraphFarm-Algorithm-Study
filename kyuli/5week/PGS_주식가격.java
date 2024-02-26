package codingTest;

import java.util.Arrays;

public class PGS_주식가격 {

	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		int[] answer = new int[prices.length];
		
		// 1. 이중 for문
		for(int i=0; i<prices.length; i++) {
			
			for(int ptr=i+1; ptr<prices.length; ptr++) {// prices[i]를 i 이후의 방과 비교해야 한다. ptr : 다음 방의 인덱스.
				answer[i]++; // 주식 가격이 3에서 2로 떨어져도 1초 동안은 떨어지지 않은 것으로 친다.
				if(prices[i] > prices[ptr]) {
					break;
				}
			}
		}
		System.out.println(Arrays.toString(answer));
		
		// 2. 스택
		
	}

}
