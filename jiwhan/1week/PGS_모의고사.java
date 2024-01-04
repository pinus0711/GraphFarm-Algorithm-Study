// https://school.programmers.co.kr/learn/courses/30/lessons/42840

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] f = {1, 2, 3, 4, 5};
        int[] s = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] t = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int fCnt = 0;
        int sCnt = 0;
        int tCnt = 0;
        
        int fTemp = 0;
        int sTemp = 0;
        int tTemp = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (fTemp == f.length) fTemp = 0;
            if (sTemp == s.length) sTemp = 0;
            if (tTemp == t.length) tTemp = 0;
            
            if (answers[i] == f[fTemp]) fCnt++;
            if (answers[i] == s[sTemp]) sCnt++;
            if (answers[i] == t[tTemp]) tCnt++;
            
            fTemp++;
            sTemp++;
            tTemp++;
        }
        
        int[] result = getResultArray(fCnt, sCnt, tCnt);
        
        return result;
        
    }
    
    int[] getResultArray (int fCnt, int sCnt, int tCnt) {
            int[] arr = {fCnt, sCnt, tCnt};
            Queue<Integer> que = new LinkedList<>();
        
            que.offer(fCnt);
        
            for (int i = 1; i < arr.length; i++) {
                if (que.peek() > arr[i]) continue;
                else if (que.peek() == arr[i]) que.offer(arr[i]);
                else {
                    que.poll();
                    que.offer(arr[i]);
                }
            }
        
            for (int i = 0; i < arr.length; i++) {
                if (que.isEmpty()) break;
                if (que.peek() == arr[i]) {
                    que.poll();
                    que.offer(i + 1);
                }
            }
            
            int[] result = new int[que.size()];
        
            for (int i = 0; i < result.length; i++) result[i] = que.poll();
            
            return result;
        }
}