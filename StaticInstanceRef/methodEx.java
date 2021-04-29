package week6;
import java.util.function.IntBinaryOperator;
public class methodEx {
	public static void main(String[] args) {
		IntBinaryOperator opt;
		//���� �޼ҵ� ����
		opt = (x,y) -> Calculator.staticMethod(x, y); // ���ٽ�
		System.out.println("result1 : " + opt.applyAsInt(10, 40));
		
		opt = Calculator::staticMethod;//�޼ҵ� ����
		System.out.println("result2 : " + opt.applyAsInt(20, 30));
		
		//�ν��Ͻ� �޼ҵ� ����
		Calculator obt = new Calculator();
		opt = (x,y) -> obt.instanceMethod(x, y); // ���ٽ�
		System.out.println("result3 : " + opt.applyAsInt(30, 70));

		opt = obt::instanceMethod; // ���ٽ�
		System.out.println("result4 : " + opt.applyAsInt(20, 80));
	}
}
