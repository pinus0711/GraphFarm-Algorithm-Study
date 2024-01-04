package step00study;

class Solution {
    public int solution(int number, int n, int m) {
        
        int answer = 0;
        
        if (number % n == 0 && number % m == 0) {
            answer = 1;
        } else answer = 0;
        
        // int answer = (number % (n * m) == 0) ? 1 : 0;
        // 위 코드처럼 작성하면 왜 안되는지 생각해보기
        
        // n과 m을 단순히 곱한 공배수로 나누는 것이 아니라, 최소공배수로 나누어야 하는 것
        // n과 m을 곱한 공배수의 약수가 number로 들어오게 되면 문제가 발생
        // 반례 : number = 16, n = 8, m = 4
        
        return answer;
    }
}