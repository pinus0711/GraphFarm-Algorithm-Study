package Baekjun;
import java.util.*;
import java.io.*;
 
public class Main {	

	public static void main(String[] args)throws IOException{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] dp=new int[100005];
		dp[0]=dp[1]=0;
		dp[2]=dp[5]=1;
		for(int i=2;i<=n;i++) {
			if(dp[i]>=1) {
				if(dp[i+2]==0)dp[i+2]=dp[i]+1;
				else dp[i+2]=Math.min(dp[i]+1, dp[i+2]);
				if(dp[i+5]==0)dp[i+5]=dp[i]+1;
				else dp[i+5]=Math.min(dp[i]+1, dp[i+5]);
			}
		}
		
		if(dp[n]!=0)
			System.out.println(dp[n]);
		else
			System.out.println(-1);
		
	}
	
}
