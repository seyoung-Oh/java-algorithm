import java.util.function.ToIntBiFunction;
public class ParamMethodReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToIntBiFunction<String,String> function;
		
		function = (a,b) -> a.compareToIgnoreCase(b);
		print(function.applyAsInt("Java8", "JAVA8"));
		
		function = String::compareToIgnoreCase;
		print(function.applyAsInt("Java8", "JAVA8"));
		
		
	}
	
	public static void print(int order) {
		if(order < 0)
			System.out.println("�տ� �ɴϴ�");
		else if(order ==0)
			System.out.println("������ ���ڿ�");
		else
			System.out.println("�ڿ� �ɴϴ�");
	}	

}
