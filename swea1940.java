import java.util.*;
import java.io.*;
public class swea1940{
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int test_case=1;test_case<=t;test_case++)
		{
			int rc = 0;
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n][2];
			int dis=0;
			for(int i=0;i<n;i++)
			{
				st = new StringTokenizer(br.readLine());
				arr[i][0] = Integer.parseInt(st.nextToken()); 
				if(arr[i][0]!=0)
					arr[i][1] = Integer.parseInt(st.nextToken()); 
				if(arr[i][0] == 1)
				{
					rc += arr[i][1];
				}
				else if(arr[i][0]==2)
				{
					 if(rc ==0)
						rc = 0;
	                 else
	                    rc -= arr[i][1];
				}
				
				dis += rc;
				
			}
			System.out.println("#" + test_case+" "+dis);
			
					
		}
	}

}