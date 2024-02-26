// https://school.programmers.co.kr/learn/courses/30/lessons/42889

import java.util.*;

class Solution {
    
    public int[] solution(int N, int[] stages) {
        
        int[] user = new int[N + 1];
        
        // 각 stage 별 클리어 인원 수 
        for (int i = 1; i <= user.length; i++) {
            
            for (int j = 0; j < stages.length; j++) {
                
                if (stages[j] >= i) ++user[i - 1];
            }
        }
        
        // 클리어 인원 수 / 도달한 인원 수 계산하여 해당 stage를 key로 하는 map에 저장
        Map<Integer, Double> map = new HashMap<>();
        
        for (int i = 0; i < user.length - 1; i++) {
            
            double now = (double)(user[i] - user[i + 1]) / (double)user[i];
            
            // 0 / 0으로 NaN이 나올 경우 now를 0.0으로 변환
            if (Double.isNaN(now)) now = 0.0d;
            
            map.put(i + 1, now);
        }
        
        // value 기준으로 정렬
        List<Integer> keys = new ArrayList<>(map.keySet());
        
		    Collections.sort(keys, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
        
        int[] result = keys.stream().mapToInt(Integer::intValue).toArray();
        
        return result;
    }
}
