class Solution {
    
  int cnt = 0;
  
  public int solution(int[] numbers, int target) {
      
      dfs(0, 0, numbers, target);
      
      return cnt;
  }
  int i = 0;
  
  public void dfs (int now, int temp, int[] numbers, int target) {
      
      if (temp == numbers.length) {
          if (now == target) cnt++;
          
          return;
      }
      
      dfs(now + numbers[temp], temp + 1, numbers, target);
      dfs(now - numbers[temp], temp + 1, numbers, target);
  }
}
