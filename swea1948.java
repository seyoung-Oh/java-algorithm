import java.util.*;
import java.io.*;
public class swea1948{
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int test_case = 1;test_case<=t;test_case++)
		{
			st = new StringTokenizer(br.readLine());
			int fm = Integer.parseInt(st.nextToken());
			int fd = Integer.parseInt(st.nextToken());
			int tm = Integer.parseInt(st.nextToken());
			int td = Integer.parseInt(st.nextToken());
			int date = 0;
			for(int i = fm-1;i<tm-1;i++)
			{
				date += arr[i];
			}
			date += td - fd + 1;
			System.out.println("#"+test_case+ " " +date);
			
		}
	}

}