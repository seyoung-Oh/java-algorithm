package week6;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
		MyFunctionalInterface5 fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: "+ localVar + "\n");
		};
		fi.method();
	}
}
