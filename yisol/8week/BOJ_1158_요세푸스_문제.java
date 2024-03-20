package ch10;
import java.util.*;
import java.io.*;
 
public class baekjun {	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		Queue<Integer> que=new LinkedList<>();
		
		for(int i=m;i<=n;i++) {
			que.offer(i);
		}
		for(int i=1;i<m;i++) {
			que.offer(i);
		}
		int index=0;
		String str="<";
		
		while(que.size()!=1) {
			if(index%m==0) {
				str=str+que.poll()+", ";
			}
			else {
				int y=que.poll();
				que.offer(y);
			}
			index++;
		}
		str=str+que.poll()+">";
		System.out.println(str);
	}

}

