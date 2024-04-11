package Baekjun;
import java.util.*;
import java.io.*;
 
public class Main {	
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int[] arr=new int[n];
		int cnt=0;
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		st=new StringTokenizer(br.readLine());
		int x=Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		int end=n-1;  //배열의 끝에서 시작
		int sum=0;
		for(int start=0;start<n;start++) {
			while(start<end) {
				sum=arr[start]+arr[end];
				if(sum==x) {
					cnt++;
					break;
				}
				else if(sum>x)end--;
				else if(sum<x)break;
			}
		}
		System.out.println(cnt);
		
	}
	
}

