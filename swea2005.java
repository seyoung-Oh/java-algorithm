import java.util.*;
import java.io.*;
public class swea2005{
	
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int test_case=1;test_case<=t;test_case++)
		{
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n][n];
			arr[0][0] = 1;
			for(int i =1;i<n;i++)
			{
				for(int j=0;j<n;j++) {
					if(j==0||j==i)
					{
						arr[i][j] = 1;
					}
					else
						arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
					
				}
				
			}
			System.out.println("# "+test_case);
			for(int i =0;i<n;i++)
			{
				for(int j =0;j<=i;j++)
				{
					System.out.printf("%d ",arr[i][j]);
				}
				System.out.println();
			}
		}
		
		
		
	}
}
