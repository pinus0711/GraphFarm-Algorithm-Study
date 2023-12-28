// https://school.programmers.co.kr/learn/courses/30/lessons/92334

import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] result = new int[id_list.length];
        
        HashMap<String, HashSet<String>> map = new HashMap<>();
        
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> setting = new HashSet<>();
            
            map.put(id_list[i], setting);
        }

        for (int i = 0; i < report.length; i++) {
            String[] split = report[i].split(" ");
            HashSet<String> set = new HashSet<>();

            if (map.containsKey(split[0])) {
                set = map.get(split[0]);
                set.add(split[1]);
            }
            else set.add(split[1]);

            map.put(split[0], set);
        }
        
        int[] cnt = new int[id_list.length];
        
        for (int i = 0; i < id_list.length; i++) {
            for (int j = 0; j < id_list.length; j++) {
                if (map.get(id_list[i]).contains(id_list[j])) cnt[j]++;
            }
        }
        
        for (int i = 0; i < id_list.length; i++) {
            for (int j = 0; j < id_list.length; j++) {
                if (map.get(id_list[i]).contains(id_list[j]) && cnt[j] >= k) result[i]++;
            }
        }
        
        return result;
    }
}
