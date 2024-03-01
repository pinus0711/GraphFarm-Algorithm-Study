package ch10;

import java.util.*;;

public class baekjun {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
        int T=sc.nextInt();
 	   int[][] dp=new int[50][2];
	   dp[0][0]=1;
	   dp[0][1]=0;
	   dp[1][0]=0;
	   dp[1][1]=1;  //초기값 설정
 	   
       for(int i=0;i<T;i++) {
    	   int N=sc.nextInt();
    	   if(N>1) {
    		   for(int j=2;j<=N;j++) {
    			   dp[j][0]=dp[j-1][0]+dp[j-2][0];
    			   dp[j][1]=dp[j-1][1]+dp[j-2][1];  //배열에 저장해두고 쓰기
    		   }
    	   }
    	   String str=dp[N][0]+" ";
    	   str+=dp[N][1];
    	   System.out.println(str);
       }
    }
	
}
