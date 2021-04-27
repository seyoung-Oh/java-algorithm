package week6;

public class MyFuctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface fi;
		
		fi = () -> {
			String str = "first call";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> { System.out.println("second call");	};
		fi.method();
		
		fi = () -> System.out.println("third call");
		fi.method();
		
	}

}
