import java.util.Scanner;
import java.lang.Math;
public class swea2070{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 1 ;i<=t;i++)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			if(n<m)
				System.out.println("#"+i+" <");
			else if(n == m)
				System.out.println("#"+i+" =");
			else
				System.out.println("#"+i+" >");
		}
		
		
		sc.close();
	}

}