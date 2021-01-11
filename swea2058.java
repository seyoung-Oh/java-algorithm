import java.util.Scanner;
import java.lang.Math;

public class swea2058{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int sum = 0;
		for(int test_case = 3 ;test_case >= 0;test_case--)
		{
			int temp = t % (int)(Math.pow(10, test_case));
			sum += t / (int)Math.pow(10, test_case);
			t = temp;	
		}
		System.out.println(sum);
		sc.close();
	}

}