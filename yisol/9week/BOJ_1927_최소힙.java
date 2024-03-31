import java.util.*;
import java.io.*;
 
public class Main {	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			int n=sc.nextInt();
			if(n==0) {
				if(pq.isEmpty()) System.out.println(0);  //0인데 배열이 비었을 경우 처리
				else System.out.println(pq.poll());
			}else {
				pq.add(n);
			}
		}
	}

}

