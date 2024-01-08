// https://school.programmers.co.kr/learn/courses/30/lessons/161989

class Solution {
    public int solution(int n, int m, int[] section) {
        int[] arr = new int[n];
        boolean flag = true;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
            
            for (int j = 0; j < section.length; j++) {
                if (i == section[j] - 1) {
                    arr[i] = 0;
                    flag = false;
                }
            }
        }
        
        if (flag) return 0;
        
        int cnt = 0;
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] == 0) {
                for (int j = i; j < m + i; j++) {
                    if (j >= arr.length) break;
                    
                    arr[j] = 1;
                }
                cnt++;
            }
            
        }
        
        return cnt;
    }
}