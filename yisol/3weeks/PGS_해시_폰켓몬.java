import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int N=nums.length/2;
        
        HashSet<Integer> num=new HashSet<>();
        for(int i:nums){
            num.add(i);
        }
        if(N>num.size()){
            return num.size();
        }
        return N;
    }
}
