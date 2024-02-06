import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q=new LinkedList<>();
        
        for(int i=1;i<n+1;i++) {
        	q.add(i);
        }
        
        while(q.size()>1) {
        	q.poll();
        	int temp=q.poll();
        	q.add(temp);
        }
        System.out.println(q.poll());
    }
}
