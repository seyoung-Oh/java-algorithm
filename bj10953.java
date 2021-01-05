import java.util.Scanner;
public class bj10953 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i =0;i<n;i++)
		{
			String[] str = sc.next().split(",");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			System.out.println(a+b);
			
		}
		sc.close();
	}

}
