import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] array=new int[N];
		
		for(int i=0;i<N;i++) {
			array[i]=sc.nextInt();
		}
		int answer=array[0];
		
		for(int j=1;j<N;j++) {
			array[j]=Math.max(array[j], array[j-1]+array[j]);
			answer=Math.max(array[j], answer);
		}
		System.out.println(answer);
	}
}
