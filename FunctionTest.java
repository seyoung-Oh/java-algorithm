package week7_1;

import java.util.function.Function;

public class FunctionTest {//�Ű����� return ������ ����
	public static void main(String[] args) {
		Function<Integer,String> M_fun = (i) -> Integer.toString(i);//integer�� �޾ƿ� String���� ��ȯ
		System.out.println(M_fun.apply(100).length());
		System.out.println(M_fun.apply(1000).length());
	}
}
