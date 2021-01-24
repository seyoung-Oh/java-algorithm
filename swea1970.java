import java.util.*;
import java.io.*;
public class swea1970{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] arr = {50000,10000,5000,1000,500,100,50,10};
		
		for(int test_case= 1;test_case <= t; test_case++)
		{
			int[] count = {0,0,0,0,0,0,0,0};
			int num = Integer.parseInt(br.readLine());
			for(int i =0;i<8;i++) {
				if(num >= arr[i])
				{
					count[i] += (int)num/arr[i];
					num = num % arr[i];
				}
			}
			System.out.println("#"+test_case);
			for(int i =0;i<8;i++) {
				System.out.printf(count[i] + " ");
			}
			System.out.printf("\n");
		}
		
	}
}
