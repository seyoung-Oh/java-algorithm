
import java.io.*;
public class swea1989{
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int test_case = 1;test_case<= t;test_case++)
		{
			String str = new String(br.readLine());
			if(str.equals(new StringBuffer(str).reverse().toString()))
				System.out.println("#"+test_case+" 1");
			else
				System.out.println("#"+test_case+" 0");
		}
		
        
       
	}

}