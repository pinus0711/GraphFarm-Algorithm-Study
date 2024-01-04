import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for(int i=0;i<my_string.length();i+=m){
            String cnt=my_string.substring(i,i+m);
            
            answer+=cnt.charAt(c-1);
        }
        return answer;
    }
}
