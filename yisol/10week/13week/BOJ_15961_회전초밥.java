import java.util.*;
import java.io.*;
 
public class Main {	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int[] sushi=new int[N];
		int[] eaten=new int[d+1];  //먹은걸 확인하기 위한 배열 > 스시번호를 인덱스로 받아서 갯수 체크
		int cnt=0;  //초밥 종류 확인
		for(int i=0;i<N;i++) {
			sushi[i]=Integer.parseInt(br.readLine());
		}
		
		eaten[c]++;
        cnt++;
		
		for(int i=0;i<k;i++) {
			if(eaten[sushi[i]]==0) {
				cnt++;
			}
			eaten[sushi[i]]++;
		}
        int max=cnt;
		for(int i=1;i<N;i++) {
			eaten[sushi[i-1]]--;
			if(eaten[sushi[i-1]]==0)cnt--;
			int end=sushi[(i+k-1)%N];
			
			if(eaten[end]==0) cnt++;
			eaten[end]++;
			
			max=Math.max(cnt, max);
		}
		
		System.out.println(max);
	}
	
}





