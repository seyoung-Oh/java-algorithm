import java.util.*;
import java.io.*;
public class swea1984 {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int test_case = 1;test_case<=t;test_case++)
		{
			int min = 0;
			int max = 0;
			int sum =0;
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[10];
			for(int i =0;i<10;i++)
			{
				arr[i] =Integer.parseInt(st.nextToken());
				if(arr[i] > max)
					max = arr[i];
				if(arr[i] < min || i==0)
					min = arr[i];
				
				sum += arr[i];
			}
			sum = sum - min - max;
			double average = sum / 8;
			
			System.out.println("#"+test_case+" "+Math.round(average));
		}
	}
}
