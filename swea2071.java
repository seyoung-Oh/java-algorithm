import java.util.Scanner;
import java.lang.Math;
public class swea2071{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 1 ;i<=t;i++)
		{
			int[] arr = new int[10];
			double sum = 0;
			for(int j =0;j<10;j++)
			{
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			
			System.out.println("#"+i +" "+ Math.round(sum/10));
			
		}
		
		
		sc.close();
	}

}