import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		for(int i=0;i<N;i++) {
			String str=sc.next();
			Stack<Character> stack=new Stack<>();
			for(char c:str.toCharArray()) {
				if(c=='(')stack.push(c);
				else if(c==')'&&stack.isEmpty()) {
					stack.push(c);
					break;
				}else stack.pop();
				
			}
			if(stack.isEmpty()) System.out.println("YES");
			else System.out.println("NO");
		}
			
	}
}
