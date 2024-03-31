package ch10;
import java.util.*;
import java.io.*;
 
public class baekjun {	
	public static int cnt=0;
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int size=(int)Math.pow(2, N);
		zfind(r,c,size);
		System.out.println(cnt);
	}
	
	public static void zfind(int x,int y,int size) {
		if(size==1) {
			return;  //size가 1이면 결국 단 하나
		}
		if(x<size/2&&y<size/2) {  //1사분면인 경우
			zfind(x,y,size/2);  //계속 1사분면 파고 들어가면 x,y에 대해 바꿀 필요가 없음 > 결국 0,0
		}else if(x<size/2&&y>=size/2) {  
			cnt+=size*size/4;  //2사분면이면 1사분면 다 방문하고 오니까
			zfind(x,y-size/2,size/2);
		}else if(x>=size/2&&y<size/2) {
			cnt+=size*size/2;  //3사분면이면 2사분명 다 방문하고 오니까
			zfind(x-size/2,y,size/2);
		}else{
			cnt+=size*size/4*3;  //4사분면이면,,,
			zfind(x-size/2,y-size/2,size/2);
		}
	}

}

