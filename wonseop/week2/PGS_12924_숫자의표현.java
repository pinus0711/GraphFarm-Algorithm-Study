package week2;

public class PGS_12924_숫자의표현 {
    class Solution {

        public int solution(int n) {
            int answer = 0;
            int sum = 0;
            for(int i = 1 ; i <= n ; i++){
                sum = 0;
                for(int j = i ; j <= n ; j++){
                    sum += j;
                    if(sum > n) break;
                    if(sum == n) {
                        answer+=1;
                        break;
                    }
                }
            }

            return answer;
        }

    }
}
