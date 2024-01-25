import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        
        int cnt=1;
        while(b>a){
            if(b%2==0){
                b/=2;
                cnt++;
            }else if(b%10==1){
                String bb = Integer.toString(b);
                bb=bb.substring(0,bb.length()-1);
                b=Integer.parseInt(bb);
                cnt++;
            }else break;
        }
             if(b==a){
                System.out.println(cnt);
            }else{
                System.out.println(-1);
             }

    }
}
