import java.util.Scanner;
import java.lang.Math;

public class swea2019{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
         
        for(int i=0;i<=num;i++)
        {
            System.out.printf((int)Math.pow(2,i)+" ");
        }
		sc.close();
		
	}

}