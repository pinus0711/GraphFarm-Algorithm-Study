// https://school.programmers.co.kr/learn/courses/30/lessons/87390
// 답 보고 품

class Solution {
    public static int[] solution(int n, long left, long right) {

        int[] answer = new int[(int)(right - left) + 1];
        
        for (int i = 0; i < answer.length; i++, left++) {
            int y = (int)(left / n + 1);
            int x = (int)(left % n + 1);
            
            answer[i] = Math.max(y, x);
        }

        return answer;
    }
}