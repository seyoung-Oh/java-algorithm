import java.util.Scanner;
import java.lang.Math;
public class bj1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0 ;i<T;i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			if(r1 > r2)
			{
				int temp = r1;
				r1 = r2;
				r2 = temp;
			}
			
			double d = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2, 2));
			int location = 0;
			
			if(d == 0 && r1 == r2)
				location = -1;
			else {
			if(r1 + r2 == d || r1 + d == r2)
				location = 1;
			else if(Math.abs(r1-r2)<d && d < r1+r2)
				location = 2;
			}
			
			System.out.println(location);
			
			
			
		}
		sc.close();
	}

}