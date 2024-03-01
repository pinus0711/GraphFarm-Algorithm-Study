// https://school.programmers.co.kr/learn/courses/30/lessons/42576

import java.util.*;

class Solution {
    
    String answer;
    
    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String str : participant) map.put(str, map.getOrDefault(str, 0) + 1);
        for (String str : completion) map.put(str, map.get(str) - 1);
        for (String str : map.keySet()) {
            if (map.get(str) != 0) {
                answer = str;
                
                break;
            }
        }

        return answer;

    }

}