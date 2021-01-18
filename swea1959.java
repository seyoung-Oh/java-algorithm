import java.util.*;
import java.io.*;
public class swea1959{
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int test_case = 1;test_case<= t;test_case++)
		{
			st = new StringTokenizer(br.readLine());
			int AiLen = Integer.parseInt(st.nextToken());
			int BjLen = Integer.parseInt(st.nextToken());
			
			int[] Ai = new int[AiLen];
			int[] Bj = new int[BjLen];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0;i<Ai.length;i++)
			{
				Ai[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0;j<Bj.length;j++)
			{
				Bj[j] = Integer.parseInt(st.nextToken());
			}
			
			int sum=0;
			int calcnum=0;
			if(Ai.length<Bj.length) {
				for(int i =0;i<=Bj.length-Ai.length;i++)
				{
					calcnum =0;
					for(int j =0;j<Ai.length;j++)
					{
						calcnum += Ai[j]*Bj[i+j];
					}
					if(calcnum > sum)
						sum = calcnum;
				}
				System.out.println("#"+test_case+" "+sum);
			}
			else
			{
				for(int i =0;i<=Ai.length-Bj.length;i++)
				{
					calcnum =0;
					for(int j =0;j<Bj.length;j++)
					{
						calcnum += Bj[j]*Ai[i+j];
					}
					if(calcnum > sum)
						sum = calcnum;
				}
				System.out.println("#"+test_case+" "+sum);
			}
				
		}
		
        
       
	}

}