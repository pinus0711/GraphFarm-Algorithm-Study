package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2630_색종이_만들기 {

	private static BufferedReader br;
	private static StringTokenizer st;
	private static int N;
	private static int[][] arr;
	private static int blue = 0;
	private static int white = 0;
	private static int row = 1;
	private static int col = 1;
	
	
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr  = new int[N+1][N+1];
		for(int i=1; i<N+1; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<N+1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		partition(1, 1, N);

		
		System.out.println(white);
		System.out.println(blue);
	}
	
	private static void partition(int row, int col, int size) {
		if(colorCheck(row, col, size)) {
			if(arr[row][col] == 1) {
				blue++;
			} else {
				white++;
			}
			return;
		}
		size /= 2;
		
		partition(row, col, size); // 1사분면
		partition(row, col+size, size); // 2사분면
		partition(row+size, col, size); // 3사분면
		partition(row+size, col+size, size); // 4사분면

	}
	
	private static boolean colorCheck(int row, int col, int size) {
		int color = arr[row][col];
		for(int i=row; i<row+size; i++) {
			for(int j=col; j<col+size; j++) {
				if(color != arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

}
