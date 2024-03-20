class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers,target,0,0);
        return answer;
    }
    
    public void dfs(int[] numbers,int target,int index,int sum){
        if(numbers.length==index){
            if(sum==target)answer++;
        }
        if(index<numbers.length){
            dfs(numbers,target,index+1,sum+numbers[index]);
            dfs(numbers,target,index+1,sum-numbers[index]);
        }else return;
        
    }
}
