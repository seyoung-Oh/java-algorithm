package week7_1;

import java.util.function.Function;

public class FunctionTest {//매개값을 return 값으로 매핑
	public static void main(String[] args) {
		Function<Integer,String> M_fun = (i) -> Integer.toString(i);//integer를 받아와 String으로 변환
		System.out.println(M_fun.apply(100).length());
		System.out.println(M_fun.apply(1000).length());
	}
}
