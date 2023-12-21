import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // 풀이.
        // System.out.print("!@#$%^&*(\'"<>?:;"); // error: illegal start of expression

        // 해답.
        System.out.print("!@#$%^&*(\\'\"<>?:;");
        // 다른 특수문자들은 그대로 입력해도 무방하나, \ 와 " 앞에는 \를 붙여서 입력한 문자 그대로 출력되도록 해야 한다.
    }
}