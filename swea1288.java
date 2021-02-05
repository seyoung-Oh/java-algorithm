import java.util.*;
import java.io.*;
import java.lang.Math;
public class swea1288 {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int test_case = 1;test_case<=t;test_case++)
		{
			int[] numarr = new int[10];
			int n = Integer.parseInt(br.readLine());
			int m =n;
			int answer = 0;
			for(int i =0;;i++)
			{
				int temp = n;
				while(n!=0)
				{
					numarr[n%10] = 1;
					n /= 10;
				}
				int count =0;
				for(int j =0;j<10;j++)
				{
					if(numarr[j] == 1)
						count++;
				}
				if(count == 10)
				{
					answer = temp;
					break;
				}
				n = m*i;
			}
			System.out.println("#"+test_case+" "+answer);
			
		}
	}
}
