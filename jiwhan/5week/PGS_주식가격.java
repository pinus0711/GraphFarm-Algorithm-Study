// https://school.programmers.co.kr/learn/courses/30/lessons/42584#

class Solution {

  public int[] solution(int[] prices) {

      int[] result = new int[prices.length];

      for (int i = 0; i < prices.length; i++) {

          int now = prices[i];
          for (int j = i + 1; j < prices.length; j++) {
              if (prices[j] >= now) result[i]++;
              else {
                  result[i]++;
                  break;
              }
          }
      }

      return result;

  }

}
