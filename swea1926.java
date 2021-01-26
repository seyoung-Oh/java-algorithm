
import java.io.*;
public class swea1926{
	
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int temp =0;
		int f = 0;
		for(int i =1;i<=t;i++)
		{
			temp = i %10;
			f = (int)i/10;
			
			if(f==3||f==6||f==9)
			{
				if(temp==3||temp==6||temp==9)
					System.out.printf("-");
				System.out.printf("-");
			}
			else 
			{
				if(temp==3||temp==6||temp==9)
					System.out.printf("-");
				else
					System.out.printf("%d",i);
			}
			System.out.printf(" ");
		}
		
		
		
	}
}
