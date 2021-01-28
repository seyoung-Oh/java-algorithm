import java.util.*;
import java.io.*;
public class swea1976{
	
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int test_case = 1;test_case <= t; test_case++)
		{
			st = new StringTokenizer(br.readLine());
			int fh = Integer.parseInt(st.nextToken());
			int fm = Integer.parseInt(st.nextToken());
			int th = Integer.parseInt(st.nextToken());
			int tm = Integer.parseInt(st.nextToken());
			
			int h = fh + th;
			if(h > 12)
				h -= 12;
			
			int m = fm + tm;
			if(m >= 60)
			{
				m -= 60;
				h++;
			}
			System.out.println("#"+test_case+" "+h+" "+m);
		}
		
		
		
		
	}
}
