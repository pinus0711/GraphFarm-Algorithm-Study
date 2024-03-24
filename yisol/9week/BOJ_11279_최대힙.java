import java.util.*;
import java.io.*;
 
public class Main {	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder()); //우선순위를 역순으로
		
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			int n=sc.nextInt();
			if(n>0)pq.add(n);
			else if(n==0) {
				if(pq.isEmpty()) {
					System.out.println(0);
				}else {
					System.out.println(pq.poll());
				}
			}
		}
		
	}

}

