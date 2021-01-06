import java.util.Scanner;

public class tsum {
	static long sum(int [] a)
	{
		long ans = 0;
		for(int i =0;i<a.length;i++)
		{
			ans += a[i];
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] a = new int[t];
		
		
		for(int i =0;i<t;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println(sum(a));
		
		sc.close();
	}

}
