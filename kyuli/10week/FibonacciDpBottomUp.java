package codingTest;

public class FibonacciDpBottomUp {
	// 50번째 피보나치 숫자 구하기 연습. 99번째 수는 오버플로우 난다.
	// 피보나치 수열은 재귀를 이용해 구할 수 있지만 동일한 연산을 여러 번 하기 때문에 시간이 오래 걸린다.
	// 이미 계산한 값을 저장하는 방식인 메모이제이션을 이용. (메모이제이션은 값을 저장하는 방식을 말하며 dp에만 국한된 방식은 아니다.)
	public static long[] d= new long[100];

	public static void main(String[] args) {

		d[1] = 1;
		d[2] = 1;
		int n = 50;
		
		for(int i=3; i<=n; i++) {
			d[i] = d[i-1] + d[i-2];
		}
		System.out.println(d[n]);
	}

}
