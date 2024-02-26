// https://school.programmers.co.kr/learn/courses/30/lessons/140108

class Solution {
  public int solution(String s) {
      
      int answer = 0;
      char x = s.charAt(0);
      int count = 1;
      
      for (int i = 1; i < s.length(); i++) {

          if (x == s.charAt(i)) count++;
          else count--;
          
          if (count == 0) {
              if (i + 1 < s.length()) s = s.substring(i + 1);
              else break;
              i = 0;
              x = s.charAt(0);
              count = 1;
              answer++;
              
          }
          
      }
      
      return ++answer;
      
  }
}