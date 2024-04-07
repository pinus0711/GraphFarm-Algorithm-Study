import java.util.*;
import java.io.*;
 
public class Main {	
	
	static int white=0;
	static int blue=0;
	static int[][] map;
	
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		map=new int[N][N];
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		partition(0,0,N);
		
		System.out.println(white);
		System.out.println(blue);
		
	}
	
	public static void partition(int x,int y,int N) {
		if(N<=0) return;
		
		if(checkColor(x,y,N)) {
			if(map[x][y]==0)white++;
			else blue++;
			return;
		}
		
		int newsize=N/2;
		partition(x,y,newsize);  //1사분면부터
		partition(x,y+newsize,newsize);
		partition(x+newsize,y,newsize);
		partition(x+newsize,y+newsize,newsize);  //4사분면 재귀
	}
	
	public static boolean checkColor(int x,int y,int N) {
		int first=map[x][y];
		for(int i=x;i<x+N;i++) {
			for(int j=y;j<y+N;j++) {
				if(first!=map[i][j])return false;  //첫번째 입력 색과 다르면 fasle
			}
		}
		return true;
	}

}

