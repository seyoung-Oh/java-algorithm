import java.util.Scanner;
import java.util.Arrays;

public class swea2063{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int [] arr = new int[t];
		for(int test_case = 0 ;test_case < t;test_case++)
		{
			arr[test_case] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println(arr[(t-1)/2]);
		
		sc.close();
	}

}