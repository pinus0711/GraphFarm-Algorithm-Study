// https://school.programmers.co.kr/learn/courses/30/lessons/76502

// 미완
// import java.util.*;

// class Solution {
//     public int solution(String s) {
//         if (s.length() % 2 == 1) return 0;
        
//         int cnt = 0;
//         boolean flag = true;
//         Deque<Character> deque = new LinkedList<>();
        
//         for (int i = 0; i < s.length(); i++) deque.offerLast(s.charAt(i));
        
//         for (int i = 0; i < deque.size(); i++) {
//             // 예외처리 : 시작자리 닫는괄호, 마지막자리 여는괄호
//             if (deque.peekFirst() == ')' || deque.peekFirst() == '}' || deque.peekFirst() == ']' ||
//                 deque.peekLast() == '(' || deque.peekLast() == '{' || deque.peekLast() == '[') {
//                 flag = false;
//             }
//             else {
//                 Deque<Character> sendingDeque = new LinkedList<>(deque);
                
//                 rightBracket(sendingDeque, deque.size());
//             }
            
//             deque.offer(deque.pollFirst());
            
//             if (flag) cnt++;
//         }
        
//         return cnt;
//     }
    
//     //여는 괄호 만나면 닫는 괄호 확인하는 함수
//     boolean rightBracket (Deque<Character> deque, int size) {
//         char closeBracket;
        
//         if (deque.pollFirst() == '(') closeBracket = ')';
//         else if (deque.pollFirst() == '{') closeBracket = '}';
//         else if (deque.pollFirst() == '[') closeBracket = ']';
//         else return false;
        
//         for (int i = 0; i < size; i++) {
//             if (deque.pollFirst() == closeBracket) return true;
//         }
            
//         return false;
//     }
// }

// 보고 푼 해결방법
import java.util.*;

public class Solution {
    static public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            String str = s.substring(i, s.length()) + s.substring(0, i);
            
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                
                if (stack.isEmpty()) {
                    stack.push(c);
                }
                else if (stack.peek() == '(' && c == ')') {
                    stack.pop();
                }
                else if (stack.peek() == '{' && c == '}') {
                    stack.pop();
                }
                else if (stack.peek() == '[' && c == ']') {
                    stack.pop();
                }
                else {
                    stack.push(c);
                }
            }
            
            if (stack.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
