
import java.io.*;
public class swea2007{
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int test_case =1;test_case<=t;test_case++)
		{
			String st = br.readLine();
			int count = 1;
			for(int j =1;j<=28;j++)
			{
				if(st.charAt(0) == st.charAt(j) && st.charAt(1)==st.charAt(j+1))
					break;
				count++;
				
			}
			System.out.println("#"+test_case+" "+count);
			
		}
        
       
	}

}