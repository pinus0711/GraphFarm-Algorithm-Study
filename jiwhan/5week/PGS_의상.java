// https://school.programmers.co.kr/learn/courses/30/lessons/42578

import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String[] cloth : clothes) map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        
        int result = 1;
        
        for (String kind : map.keySet()) result *= map.get(kind) + 1;
        
        result -= 1;
        
        return result;

    }
}