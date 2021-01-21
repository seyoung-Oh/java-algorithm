import java.util.*;
import java.io.*;
public class swea1966{
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int test_case = 1;test_case <= t;test_case++)
		{
			int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[n];
		
			for(int i =0;i<n;i++)
			{
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			System.out.printf("#"+test_case+" ");
			for(int i = 0;i<n;i++)
			{
				System.out.printf(arr[i]+" ");
			}
			System.out.println();
		}
	}

}