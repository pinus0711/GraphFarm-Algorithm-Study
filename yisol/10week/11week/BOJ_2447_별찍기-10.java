import java.util.*;
import java.io.*;
 
public class Main {	
	static StringBuilder sb=new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				star(i,j,N);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	public static void star(int x,int y,int n) {
		if((x/n)%3==1&&(y/n)%3==1)
			sb.append(" "); 
		else {
			if(n==1)
				sb.append("*");
			else
				star(x,y,n/3);
		}
	}
}

