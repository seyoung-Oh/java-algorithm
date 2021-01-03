import java.util.Scanner;

public class bj2751 {
	private static int[] array;
	private static int num;
	public static void sorting(int[] array, int num)
	{
		for(int i =1;i<num;i++)
		{
			int child = i;
			while(child > 0)
			{
				int parent = (child-1)/2;
				if(array[child] > array[parent])
				{
					int temp = array[parent];
					array[parent] = array[child];
					array[child] = temp;
				}
				child = parent;
			}
				
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		array = new int[num];
		for(int i =0;i<num;i++)
		{
			array[i] = sc.nextInt();
		}		
		
		sorting(array,num);
		
		for(int i = num-1;i>0;i--)
		{
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			
			sorting(array,i);
		}
		
		for(int i =0;i<num;i++)
		{
			System.out.println(array[i] + " ");
		}	
		sc.close();
	}

}
