// https://school.programmers.co.kr/learn/courses/30/lessons/67256

class Solution {
    
  public String solution(int[] numbers, String hand) {
      
      int[] two = {3, 1, 0, 1, 2, 1, 2, 3, 2, 3, 4};
      int[] five = {2, 2, 1, 2, 1, 0, 1, 2, 1, 2, 3};
      int[] eight = {1, 3, 2, 3, 2, 1, 2, 1, 0, 1, 2};
      int[] zero = {0, 4, 3, 4, 3, 2, 3, 2, 1, 2, 1};
      
      int lNow = 10;
      int rNow = 10;
      
      StringBuilder sb = new StringBuilder();
      
      for (int number : numbers) {
          
          if (number == 1 || number == 4 || number == 7) {
              
              sb.append("L");
              lNow = number;
          } else if (number == 3 || number == 6 || number == 9) {
              
              sb.append("R");
              rNow = number;
          } else {
              
              if (number == 2) {
                  
                  if (two[lNow] < two[rNow]) {
                      
                      sb.append("L");
                      lNow = number;
                  } else if (two[rNow] < two[lNow]) {
                      
                      sb.append("R");
                      rNow = number;
                  } else {
                      
                      if (hand.equals("right")) {
                          
                          sb.append("R");
                          rNow = number;
                      } else {
                          
                          sb.append("L");
                          lNow = number;
                      }
                  }
              } else if (number == 5) {
                  
                  if (five[lNow] < five[rNow]) {
                      
                      sb.append("L");
                      lNow = number;
                  } else if (five[rNow] < five[lNow]) {
                      
                      sb.append("R");
                      rNow = number;
                  } else {
                      
                      if (hand.equals("right")) {
                          
                          sb.append("R");
                          rNow = number;
                      } else {
                          
                          sb.append("L");
                          lNow = number;
                      }
                  }
              } else if (number == 8) {
                  
                  if (eight[lNow] < eight[rNow]) {
                      
                      sb.append("L");
                      lNow = number;
                  } else if (eight[rNow] < eight[lNow]) {
                      
                      sb.append("R");
                      rNow = number;
                  } else {
                      
                      if (hand.equals("right")) {
                          
                          sb.append("R");
                          rNow = number;
                      } else {
                          
                          sb.append("L");
                          lNow = number;
                      }
                  }
              } else if (number == 0) {
                  
                  if (zero[lNow] < zero[rNow]) {
                      
                      sb.append("L");
                      lNow = number;
                  } else if (zero[rNow] < zero[lNow]) {
                      
                      sb.append("R");
                      rNow = number;
                  } else {
                      
                      if (hand.equals("right")) {
                          
                          sb.append("R");
                          rNow = number;
                      } else {
                          
                          sb.append("L");
                          lNow = number;
                      }
                  }
              }
          }
      }
      
      return sb.toString();
  }
}