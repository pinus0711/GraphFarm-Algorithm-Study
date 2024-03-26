package ch10;
import java.util.*;
import java.io.*;
 
public class baekjun {	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		int[][] item=new int[N+1][2];
		int[][] dp=new int[N+1][K+1];
		
		for(int i=1;i<=N;i++) {
			st=new StringTokenizer(br.readLine());
			int w=Integer.parseInt(st.nextToken());
			int v=Integer.parseInt(st.nextToken());
			item[i][0]=w;
			item[i][1]=v;
		}
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=K;j++) {
				if(j-item[i][0]>=0)  //현재 무게에서 현재item무게 빼줘서 남은 무게 확인 > dp[i-1]에 저장된 최댓값을 참조해오기
					dp[i][j]=Math.max(dp[i-1][j], item[i][1]+dp[i-1][j-item[i][0]]);  
				else
					dp[i][j]=Math.max(dp[i-1][j], 0);
			}
		}
		
		System.out.println(dp[N][K]);
	}

}

