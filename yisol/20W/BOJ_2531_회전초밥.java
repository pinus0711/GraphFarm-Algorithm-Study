import java.util.*;
import java.io.*;

public class baekjun{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int d=sc.nextInt();
		int k=sc.nextInt();
		int c=sc.nextInt();
		int cnt=1;  //쿠폰 먹음 처리
		int result=0;
		int[] visited=new int[d+1];
		int[] dishes=new int[N+k];
		for(int i=0;i<N;i++) {
			dishes[i]=sc.nextInt();
		}
		visited[c]++; //쿠폰 미리 방문처리
		for(int i=0;i<k;i++) {
			dishes[N+i]=dishes[i];
			if(visited[dishes[i]]==0) {
				cnt++;
				visited[dishes[i]]++;
			}else visited[dishes[i]]++;
		}
		
		result=cnt;
		for(int i=1;i<=N;i++) {
			visited[dishes[i-1]]--;
			if(visited[dishes[i-1]]==0)cnt--;  //빠져나감 처리
			if(visited[dishes[i+k-1]]==0) {  //들어오는거 처리
				cnt++;
				visited[dishes[i+k-1]]++;
			}else visited[dishes[i+k-1]]++;
			result=Math.max(cnt, result);
		}
		
		System.out.println(result);
	}
}


