package step00study;

class Solution {
    public String solution(String code) {
        
        String answer = "";
        int mode = 0;
        
        for (int i=0; i<code.length(); i++) {
            // mode 토글 부분
            if (code.charAt(i) == '1') {
                mode = 1 - mode;
            }
            // 문자열 생성 부분
            else if (i % 2 == mode) {
                answer += code.charAt(i);
            }
        }
             
        return answer.equals("") ? "EMPTY" : answer;
    }
}