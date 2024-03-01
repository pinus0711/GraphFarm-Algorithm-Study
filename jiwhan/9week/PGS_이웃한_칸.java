// https://school.programmers.co.kr/learn/courses/30/lessons/250125

class Solution {
    
  public int solution(String[][] board, int h, int w) {
      
      int count = 0;
      
      String color = board[h][w];
      int n = board[h].length;
      
      int[] dh = {0, 1, -1, 0};
      int[] dw = {1, 0, 0, -1};
      
      for (int i = 0; i <= 3; i++) {
          
          int hCheck = h + dh[i];
          int wCheck = w + dw[i];
          
          if ((hCheck >= 0 && hCheck < n)
              && (wCheck >= 0 && wCheck < n)
              && color.equals(board[hCheck][wCheck])) count++;
      }
      
      return count;
  }
}