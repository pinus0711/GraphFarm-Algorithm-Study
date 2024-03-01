package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2941_크로아티아_알파벳 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		
		a = a.replace("c=", "a");
		a = a.replace("c-", "a");
		a = a.replace("dz=", "a");
		a = a.replace("d-", "a");
		a = a.replace("lj", "a");
		a = a.replace("nj", "a");
		a = a.replace("s=", "a");
		a = a.replace("z=", "a");
		
		System.out.println(a.length());
	}

}
