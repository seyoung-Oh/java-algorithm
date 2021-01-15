import java.util.Scanner;
import java.lang.Math;

public class swea1284{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int cost = 0;
        for(int i = 1; i<=t;i++)
        {
        	cost = 0;
        	int acost = 0;
        	int bcost = 0;
        	
        	int p = sc.nextInt();
        	int q = sc.nextInt();
        	int r = sc.nextInt();
        	int s = sc.nextInt();
        	int w = sc.nextInt();
        	
        	//a사의 경우 w*p
        	acost = w * p;
        	
        	//b사의 경우 
        	if(w < r)
        		bcost= q;
        	else if(w > r)
        		bcost = q + (s*(w-r));
        	
        	
        	if(acost<bcost) 
        		cost = acost;
      
        	else if(acost > bcost)
        		cost = bcost;
        	
        	System.out.printf("#"+i+" "+cost+"\n");
        	
        }
		
	}

}