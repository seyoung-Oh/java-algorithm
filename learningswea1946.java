import java.util.*;
import java.io.*;
public class learningswea1946 {

	public static void main(String[] args) throws Exception {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st;
	     StringBuilder sb= new StringBuilder();
	         
	     int T= stoi(br.readLine());
	         
	     for(int tc=1;tc<=T;++tc) {
	        int N = stoi(br.readLine());
	        int cnt =0;
	        for(int i=0;i<N;++i)
	        {
	            st= new StringTokenizer(br.readLine()," ");
	            String word = st.nextToken();
	            int val = stoi(st.nextToken());
	            for(int j=0;j<val;++j) {
	                sb.append(word);
	                cnt++;
	                if(cnt >=10) {
	                     sb.append('\n');
	                     cnt=0;
	                }
	            }
	         }
	         sb.append('\n');
	         System.out.println("#"+tc);
	     }
	        
	     System.out.println(sb);
	 }
	     
	 static int stoi(String s) {
	     return Integer.parseInt(s);
	   }

}
