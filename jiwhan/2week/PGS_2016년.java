// https://school.programmers.co.kr/learn/courses/30/lessons/12901

// java.time 패키지라고 함 이거때문에 10~20분 쓴듯
import java.time.*;

class Solution {
    
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);

        return date.getDayOfWeek().toString().substring(0, 3);
    }
    
}
