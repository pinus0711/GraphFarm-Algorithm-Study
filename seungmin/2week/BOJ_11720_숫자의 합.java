import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 첫 번째 줄의 입력 (숫자의 개수)
		String sNum = sc.next(); // 두 번째 줄의 입력 (각각 더할 숫자의 나열)
		
		char[] cNumArr = sNum.toCharArray();
		
		int sum = 0; // 정수형 누적 변수
		for (int i=0; i<cNumArr.length; i++) {
			sum += cNumArr[i] - 48; // char[]의 각 요소인 문자를 숫자로 변환 후 누적
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}