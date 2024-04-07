import java.util.*;
import java.io.*;
 
public class Main {	//그리디 사용
	
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		int N=sc.nextInt();
		int K=sc.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=N-1;i>=0;i--) {
			while(K-arr[i]>=0) {
				K-=arr[i];
				cnt++;
			}
			if(K==0) break;
		}
		
		System.out.println(cnt);
	}
}

