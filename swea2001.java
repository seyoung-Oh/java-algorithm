import java.util.*;
import java.io.*;
public class swea2001{
	static int n;
	static int m;
	static int arr[][];
	private static int cal(int x,int y,int max)
	{
		int sum = 0;
		for(int i =x;i<x+m;i++)
		{
			for(int j = y;j<y+m;j++)
			{
				sum += arr[i][j];
			}
		}
		max = Math.max(max, sum);
		return max;
	}
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for(int test_case= 1;test_case <= t; test_case++)
		{
			st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			arr = new int[n][n];
			for(int i = 0;i<n;i++)
			{
				st = new StringTokenizer(br.readLine());
				for(int j =0;j<n;j++)
				{
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int max = Integer.MIN_VALUE;
			for(int i =0;i<=n-m;i++)
			{
				for(int j =0;j<=n-m;j++)
				{
					max = cal(i,j,max);
				}
			}
			System.out.println("#" + test_case+" "+max);
			
		}
		
	}
}
