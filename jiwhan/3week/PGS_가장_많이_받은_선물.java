// https://school.programmers.co.kr/learn/courses/30/lessons/258712

import java.util.*;
import java.util.Map.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, HashMap<String, Integer>> map = new HashMap<>();
        Map<String, Integer> giftValueMap = new HashMap<>();
        Map<String, Integer> nextMonthReciveMap = new HashMap<>();
        
        // 기본값 설정하는 for문
        for (int i = 0; i < friends.length; i++) {
            
            HashMap<String, Integer> tempMap = new HashMap<>();
            
            for (int j = 0; j < friends.length; j++) {
                if (i != j) tempMap.put(friends[j], 0);
            }
            
            map.put(friends[i], tempMap);
            giftValueMap.put(friends[i], 0);
            nextMonthReciveMap.put(friends[i], 0);
            
        }
        
        for (int i = 0; i < gifts.length; i++) {
            
            String[] giftArr = gifts[i].split(" ");
            // 현재 준 횟수에 1을 더함
            int value = map.get(giftArr[0]).get(giftArr[1]) + 1;
            
            HashMap<String, Integer> valueMap = map.get(giftArr[0]);
            HashMap<String, Integer> tempMap = new HashMap<>();
            
            // tempMap에 기존값과 그 위에 추가된 값을 덧씌워서 map에 put
            for (Entry<String, Integer> entry : valueMap.entrySet()) {
                if (!giftArr[0].equals(entry.getKey())) tempMap.put(entry.getKey(), entry.getValue());
            }
            
            tempMap.put(giftArr[1], value);
            map.put(giftArr[0], tempMap);
            
            // 주고 받은 횟수만큼 선물지수 증감
            giftValueMap.put(giftArr[0], giftValueMap.get(giftArr[0]) + 1);
            giftValueMap.put(giftArr[1], giftValueMap.get(giftArr[1]) - 1);
            
        }

        for (String friend : friends) {
            HashMap<String, Integer> tempMap = map.get(friend);
            
            for (Entry<String, Integer> entry : tempMap.entrySet()) {
                
                // 내가 상대방에게 준 횟수가 더 많을 경우
                if (entry.getValue() > map.get(entry.getKey()).get(friend)) {
                    nextMonthReciveMap.put(friend, nextMonthReciveMap.get(friend) + 1);
                }
                // 내가 상대방에게 받은 횟수가 더 많을 경우
                else if (entry.getValue() < map.get(entry.getKey()).get(friend)) {
                    nextMonthReciveMap.put(entry.getKey(), nextMonthReciveMap.get(entry.getKey()) + 1);
                }
                // 주고 받은 횟수가 같을 경우
                else {
                    // 선물 지수가 내가 더 높을 경우
                    if (giftValueMap.get(friend) > giftValueMap.get(entry.getKey()))
                        nextMonthReciveMap.put(friend, nextMonthReciveMap.get(friend) + 1);
                    //선물 지수가 내가 더 낮을 경우
                    else if (giftValueMap.get(friend) < giftValueMap.get(entry.getKey()))
                        nextMonthReciveMap.put(entry.getKey(), nextMonthReciveMap.get(entry.getKey()) + 1);
                    
                }
                
            }
        }

        // 내 기준과 상대 기준 두번 모두 순회하기 때문에 2 나눠줌
        int result = Collections.max(nextMonthReciveMap.values()) / 2;
        
        return result;
    }
}