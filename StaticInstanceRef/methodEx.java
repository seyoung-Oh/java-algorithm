package week6;
import java.util.function.IntBinaryOperator;
public class methodEx {
	public static void main(String[] args) {
		IntBinaryOperator opt;
		//정적 메소드 참조
		opt = (x,y) -> Calculator.staticMethod(x, y); // 람다식
		System.out.println("result1 : " + opt.applyAsInt(10, 40));
		
		opt = Calculator::staticMethod;//메소드 참조
		System.out.println("result2 : " + opt.applyAsInt(20, 30));
		
		//인스턴스 메소드 참조
		Calculator obt = new Calculator();
		opt = (x,y) -> obt.instanceMethod(x, y); // 람다식
		System.out.println("result3 : " + opt.applyAsInt(30, 70));

		opt = obt::instanceMethod; // 람다식
		System.out.println("result4 : " + opt.applyAsInt(20, 80));
	}
}
