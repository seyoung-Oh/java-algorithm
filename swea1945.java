import java.util.Scanner;
import java.lang.Math;

public class swea1945{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =1;i<=t;i++)
        {
        	int n = sc.nextInt();
        	int[] arr = {0,0,0,0,0};
        	while(true) {
        		
        		if(n % 11 ==0)
        		{
        			arr[4]++;
        			n = n / 11;
        		}
        		else if(n % 7 ==0)
        		{
        			arr[3]++;
        			n = n / 7;
        			
        		}
        		else if(n%5 ==0)
        		{
        			arr[2]++;
        			n = n / 5;
        		}
        		else if(n % 3 == 0)
        		{
        			arr[1]++;
        			n = n / 3;
        		}
        		else if(n % 2 == 0)
        		{
        			arr[0]++;
        			n = n / 2;
        		}
        		else
        		{
        			break;
        		}
        		
        		
        	}
        	System.out.printf("#"+i+" ");
        	for(int j =0;j<5;j++)
        	{
        		System.out.printf(arr[j]+ " ");
        	}
        	System.out.println();
        	
        }
        
		
	}

}