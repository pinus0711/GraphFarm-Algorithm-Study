package Baekjun;
import java.util.*;
import java.io.*;
 
public class Main {	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int[] arr=new int[N];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int[] result=new int[2];
		
		int start=0;
		int end=N-1;
		int min=Integer.MAX_VALUE;
		
		while(start<end) {
			int hap=(arr[start]+arr[end]);
			if(min>Math.abs(hap)) {
				min=Math.abs(hap);
				result[0]=arr[start];
				result[1]=arr[end];
				if(hap==0) break;
			}
            if(hap>0)end--;
            else if(hap<0)start++;
		}	
		System.out.println(result[0]+" "+result[1]);
	}
	
	
}



