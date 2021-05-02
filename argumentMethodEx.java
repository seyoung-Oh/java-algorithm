package week6;
import java.util.function.ToIntBiFunction;

public class argumentMethodEx {
	public static void main(String[] args) {
		ToIntBiFunction<String,String> func;
		
		func = (a,b) -> a.compareToIgnoreCase(b);
		println(func.applyAsInt("아미공", "아미공"));
		
		func = String::compareToIgnoreCase;
		println(func.applyAsInt("고급자바", "고급자바"));
		
	}
	private static void println(int order) {
		if(order < 0) {System.out.println("in dictionary order.");}
		else if(order == 0) { System.out.println("same string");}
		else {System.out.println("in recerse order.");}
	}
}
