package ch10;
import java.util.*;
import java.io.*;
 
public class baekjun {	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int[][] arr=new int[2][N+2];
		int[] dp=new int[N+2];
		
		for(int  i=1;i<=N;i++) {
			int T=sc.nextInt();
			int P=sc.nextInt();
			arr[0][i]=T;
			arr[1][i]=P;
		}
		
		for(int i=N;i>0;i--) {
			int next=i+arr[0][i];
			if(next>N+1) 
				dp[i]=dp[i+1];
			else {
				dp[i]=Math.max(dp[next]+arr[1][i], dp[i+1]);
			}
		}
		System.out.println(dp[1]);
		
	}

}

