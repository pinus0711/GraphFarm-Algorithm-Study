import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> todo=new ArrayList<>();
        for(int i=0;i<finished.length;i++){
            if(!finished[i]){
                todo.add(todo_list[i]);
            }
        }
        String[] answer=todo.toArray(new String[todo.size()]);
        return answer;
    }
}
