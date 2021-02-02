import java.util.*;
import java.io.*;
public class hello2021{
	public static String str_repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int test_case = 1;test_case <= t; test_case++)
		{
			int n = Integer.parseInt(br.readLine());
			String s = " ";
			
			for(int i =0;i<n;i++)
			{
				st = new StringTokenizer(br.readLine());
				String ch = st.nextToken();
				int r = Integer.parseInt(st.nextToken());
				s += str_repeat(ch,r);
			}
			System.out.println("# " + test_case);
			for(int i=0; i<s.length(); i++) {
                System.out.print(s.charAt(i));
                if( i%10 == 9 )System.out.print("\n");
            }
            System.out.print("\n");
		} 
		
		
		
	}
}
