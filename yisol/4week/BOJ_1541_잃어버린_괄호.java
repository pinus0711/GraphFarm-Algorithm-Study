package codingTest;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		String str=st.nextToken();
		String[] splitByMinus=str.split("-");
		List<Integer> answerList=new ArrayList<>();
		int answer=0;
    
		if(splitByMinus.length==1) {
      //전부 플러스인 경우
			String[] onlyPlus=str.split("\\+");
			for(String onlyplus:onlyPlus) {
				answer+=Integer.parseInt(onlyplus);
			}
		}else {
			for(String s:splitByMinus) {
			  int temp=0;
			  char c=s.charAt(0);
			  if(c=='+')
				  s="0"+s;
			  String[] splitByPlus=s.split("\\+");
        
			  for(String p:splitByPlus) {
				  temp+=Integer.parseInt(p);
			  }
			  answerList.add(temp);
		  }
		  answer=answerList.get(0);
		  for(int i=1;i<answerList.size();i++) {
			  answer-=answerList.get(i);
		  }
		}
		
		
		System.out.println(answer);
	}
}
