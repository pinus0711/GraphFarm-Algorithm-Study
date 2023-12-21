import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        
        // 풀이.
        // for (int i=0; i<a.length(); i++) {
        //     if (a[i].isLowerCase()) { // error: array required, but String found
        //         a[i] = a[i].toUpperCase();           
        //     } else {
        //         a[i] = a[i].toLowerCase();
        //     }
        // }
        // System.out.println(a);
        
        // 해답.
        String answer = "";
        
        for (int i = 0; i<a.length(); i++) {
            char c = a.charAt(i);
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }
        
        System.out.println(answer);
                
        sc.close();
    }
}