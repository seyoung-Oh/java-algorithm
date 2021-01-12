import java.util.Scanner;

public class swea2050{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int test_case = 0;test_case<26;test_case++) 
		{
			char al = str.charAt(test_case);
			for(char i ='A';i<='Z';i++)
			{
				if(al == i)
					System.out.printf("%d ",(int)i-64);
			}
		}
		sc.close();
	}

}