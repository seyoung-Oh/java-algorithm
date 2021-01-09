import java.util.Scanner;
import java.lang.Math;
public class swea2072{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i =0;i<t;i++)
		{
			int[] arr = new int[10];
			int sum = 0;
			for(int j =0;j<10;j++)
			{
				arr[j] = sc.nextInt();
				if(arr[j] % 2 == 1)
					sum += arr[j];
			}
			
			System.out.println("#"+i +" "+ sum);
			
		}
		
		
		sc.close();
	}

}