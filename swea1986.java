import java.util.Scanner;
import java.lang.Math;

public class swea1986{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int test_case = 1;test_case <= t; test_case++)
        {
        	int n = sc.nextInt();
        	if(n%2 == 0)
        	{
        		System.out.println("#"+test_case+" "+(int)(-n/2));
        	}
        	else
        	{
        		System.out.println("#"+test_case+" "+(n+1)/2);
        	}
        }
	}

}