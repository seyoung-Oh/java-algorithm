package week6;
import java.util.function.ToIntBiFunction;

public class argumentMethodEx {
	public static void main(String[] args) {
		ToIntBiFunction<String,String> func;
		
		func = (a,b) -> a.compareToIgnoreCase(b);
		println(func.applyAsInt("�ƹ̰�", "�ƹ̰�"));
		
		func = String::compareToIgnoreCase;
		println(func.applyAsInt("����ڹ�", "����ڹ�"));
		
	}
	private static void println(int order) {
		if(order < 0) {System.out.println("in dictionary order.");}
		else if(order == 0) { System.out.println("same string");}
		else {System.out.println("in recerse order.");}
	}
}
