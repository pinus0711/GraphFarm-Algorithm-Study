import java.util.*;
import java.io.*;
 
public class Main {	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		HashMap<String,Integer> map=new HashMap<>();
		int cnt=0;
		
		for(int i=0;i<N;i++) {
			String name=br.readLine();
			map.put(name, 1);
		}
		for(int i=0;i<M;i++) {
			String nameM=br.readLine();
			if(map.containsKey(nameM)) {
				map.replace(nameM, 0); //일치하는 key가 있으면 전부 value를 0으로 처리
				cnt++;
			}
		}
		ArrayList<String> nameList=new ArrayList<>(map.keySet());  // 정렬
		Collections.sort(nameList);
		System.out.println(cnt);
		
		for(String key:nameList) {
			if(map.get(key)==0)  // value가 일치해서 0인 것들만 출력
				System.out.println(key);
		}
	}

}

