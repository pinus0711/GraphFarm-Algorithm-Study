// https://school.programmers.co.kr/learn/courses/30/lessons/131128

class Solution {
    
  public String solution(String X, String Y) {
      
      String answer = "";
      int[] xArray = new int[10];
      int[] yArray = new int[10];
      
      for(char temp : X.toCharArray()) {
          
          int index = temp - '0';
          xArray[index]++;
      }

      for(char temp : Y.toCharArray()) {
          
          int index = temp - '0';
          yArray[index]++;
      }
      
      int[] answerArray = new int[10];
      
      for(int i = 0; i < 10; i++) {
          
          answerArray[i] = xArray[i] >= yArray[i] ? yArray[i] : xArray[i]; 
      }
      
      StringBuilder sb = new StringBuilder();
      
      for(int i = 9; i >= 0; i--) {
          
          for(int j = 0; j < answerArray[i]; j++){
              
              sb.append(i);
          }
      }

      answer = sb.toString();
      
      if(answer.equals("")) answer = "-1";
      else if(answer.replaceAll("0","").equals("")) answer = "0";
      
      return answer;
  }
}