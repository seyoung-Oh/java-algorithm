import java.util.Scanner;
import java.lang.Math;

public class swea2056{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int test_case = 1;test_case<=t;test_case++) 
		{
			int[] arr = new int[3];
			int num = sc.nextInt();
			for(int i =2;i>=0;i--)
			{
				arr[2-i] = num / (int)Math.pow(10, 2*i);
				num = num- arr[2-i]*(int)Math.pow(10, 2*i);
			}
		
			if(arr[1] <=12 && arr[1] >0) {
				if(arr[1] == 4|| arr[1]==6||arr[1]==9||arr[1]==11)
				{
					if(arr[2] <= 30 && arr[2] > 0)
						System.out.printf("#%d %04d/%02d/%02d\n",test_case, arr[0],arr[1],arr[2]);
					else
						System.out.println("#"+test_case+" -1");
				}
				else if(arr[1] ==2)
				{
					if(arr[2] <= 28 && arr[2] > 0)
						System.out.printf("#%d %04d/%02d/%02d\n",test_case, arr[0],arr[1],arr[2]);
					else
						System.out.println("#"+test_case+" -1");
				}
				else
				{
					if(arr[2] <= 31 && arr[2] >0)
						System.out.printf("#%d %04d/%02d/%02d\n",test_case,arr[0],arr[1],arr[2]);
					else
						System.out.println("#"+test_case+" -1");
				}
		}
		else
			System.out.println("#"+test_case+" -1");
		
		}
		sc.close();
	}

}