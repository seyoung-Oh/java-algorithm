import java.util.function.IntBinaryOperator;
public class MethodReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBinaryOperator operator;
		//���� �޼ҵ� ����
		operator = (x,y) -> Calculator.staticMethod(x, y);
		System.out.println("result-1: " + operator.applyAsInt(1, 2));
		
		operator = Calculator::staticMethod;
		System.out.println("result-2: "+ operator.applyAsInt(3, 4));
		
		//�ν��Ͻ� �޼ҵ� ����
		Calculator cal = new Calculator();
		operator = (x, y)->cal.instanceMethod(x, y);
		System.out.println("result-3: "+ operator.applyAsInt(5, 6));
		
		operator = cal::instanceMethod;
		System.out.println("result-4: " + operator.applyAsInt(7, 8));
	}

}
