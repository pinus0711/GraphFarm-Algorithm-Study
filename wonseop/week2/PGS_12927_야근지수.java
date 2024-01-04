package week2;

import java.util.*;

public class PGS_12927_야근지수 {
    class Solution {
        public long solution(int n, int[] works) {
            long answer = 0;

            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            for(int i = 0 ; i < works.length ; i++){
                pq.add(works[i]);
            }

            for(int i = 0 ; i < n ; i++){
                int val = pq.poll();
                if(val > 0){
                    pq.add(val-1);
                }
                else{
                    pq.add(val);
                }
            }

            for(int x : pq){
                answer += x * x;
            }

            return answer;
        }
    }
}
