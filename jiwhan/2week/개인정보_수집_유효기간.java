// https://school.programmers.co.kr/learn/courses/30/lessons/150370#

import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        // 약관의 종류와 기간을 구분
        String[] kind = new String[terms.length];
        int[] period = new int[terms.length];
        
        for (int i = 0; i < terms.length; i++) {
            String[] temp = terms[i].split(" ");
            
            kind[i] = temp[0];
            period[i] = Integer.parseInt(temp[1]);
        }

        // 수집된 개인정보의 일자와 종류를 구분
        String[] collectedDate = new String[privacies.length];
        String[] collectedKind = new String[privacies.length];
        
        for (int i = 0; i < privacies.length; i++) {
            String[] temp = privacies[i].split(" ");
            
            collectedDate[i] = temp[0];
            collectedKind[i] = temp[1];
        }
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < privacies.length; i++) {
            boolean flag = false;
            
            for (int j = 0; j < terms.length; j++) {
                if (collectedKind[i].equals(kind[j])) flag = isDateOver(today, collectedDate[i], period[j]);
            }
            
            if (flag == true) answer.add(i);
        }
        
        int[] result = new int[answer.size()];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = answer.get(i) + 1;
        }
        
        return result;
    }
    
    boolean isDateOver(String today, String collectedDate, int period) {
        
        // 각각의 연/월/일을 구분하여 int형으로 변환
        String[] strTodayArr = today.split("\\.");
        int[] todayArr = new int[strTodayArr.length];
        
        for (int i = 0; i < todayArr.length; i++) {
            todayArr[i] = Integer.parseInt(strTodayArr[i]);
        }
        
        String[] strCollectedDateArr = collectedDate.split("\\.");
        int[] collectedDateArr = new int[strCollectedDateArr.length];
        
        for (int i = 0; i < collectedDateArr.length; i++) {
            collectedDateArr[i] = Integer.parseInt(strCollectedDateArr[i]);
        }
        
        // period와 collectedDate의 월을 더한 후 12월을 넘어갈 시 연도를 추가
        collectedDateArr[1] += period;
        
        while (collectedDateArr[1] > 12) {
            collectedDateArr[1] -= 12;
            collectedDateArr[0]++;
        }
        
        // today의 연/월/일과 collectedDate의 연/월/일을 각각 비교하며 boolean형 return
        if (collectedDateArr[0] < todayArr[0]) return true;
        
        else if ((collectedDateArr[0] == todayArr[0]) &&
                 (collectedDateArr[1] < todayArr[1])) return true;
        
        else if ((collectedDateArr[0] == todayArr[0]) &&
                 (collectedDateArr[1] == todayArr[1]) &&
                 (collectedDateArr[2] < todayArr[2])) return true;
        
        else if ((collectedDateArr[0] == todayArr[0]) &&
                 (collectedDateArr[1] == todayArr[1]) &&
                 (collectedDateArr[2] == todayArr[2])) return true;
        
        else return false;
    }
}