// https://school.programmers.co.kr/learn/courses/30/lessons/42628

import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (String operation : operations) {
            String[] temp = operation.split(" ");
            
            if (temp[0].equals("I")) {
                pq.offer(Integer.parseInt(temp[1]));
            } else {
                if (pq.isEmpty()) continue;
                else if (temp[1].equals("-1")) pq.remove();
                else pq = reverse(pq);
            }
        }
        
        int[] result = new int[2];
        
        if (pq.isEmpty()) {
            result[0] = 0;
            result[1] = 0;
        } else {
            result[0] = getMax(pq);
            result[1] = pq.peek();
        }
        
        return result;
    }
    
    PriorityQueue<Integer> reverse(PriorityQueue<Integer> pq) {
        PriorityQueue<Integer> tempPq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int temp : pq) {
            tempPq.offer(temp);
        }
        
        tempPq.remove();
        
        pq.clear();
        
        for (int temp : tempPq) {
            pq.offer(temp);
        }
        
        return pq;
    }
    
    int getMax(PriorityQueue<Integer> pq) {
        PriorityQueue<Integer> tempPq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int temp : pq) {
            tempPq.offer(temp);
        }
        
        return tempPq.peek();
    }
}
