// https://school.programmers.co.kr/learn/courses/30/lessons/42842

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] result = new int[2];
        
        int total = brown + yellow;
        
        int nowBrown = 1;
        
        int w = total;
        int h = 1;
        
        while (true) {
            int[][] tempArr = new int[w][h];

            for (int i = 0; i < tempArr.length; i++) {
                tempArr[i][0] = nowBrown;
                tempArr[i][tempArr[0].length - 1] = nowBrown;
            }
            
            for (int i = 0; i < tempArr[0].length; i++) {
                tempArr[0][i] = nowBrown;
                tempArr[tempArr.length - 1][i] = nowBrown;
            }
            
            int cnt = 0;
            
            for (int i = 0; i < tempArr.length; i++) {
                for (int j = 0; j < tempArr[i].length; j++) {
                    if (tempArr[i][j] == nowBrown) cnt++;
                }
            }
            
            if (cnt == brown) {
                result[0] = w;
                result[1] = h;
                break;
            }
            else {
                while (true) {
                    h++;
                    if (total % h == 0) {
                        w = total / h;
                        break;
                    }
                }
            }
        }
        
        return result;
    }
}