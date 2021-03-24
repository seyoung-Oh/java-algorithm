
public class HelloWorldAnonymousClass {

	interface HelloWorld{
		public void greet();
		public void greetSomeone(String someone);
	}
	
	public void sayHello() {
		//지역클래스
		class EnglishGreeting implements HelloWorld{
			String name = "world";
			public void greet() {
				greetSomeone("world");
			}
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello" + name);
			}
		}
		HelloWorld englishGreeting = new EnglishGreeting();
		//무명클래스
		HelloWorld frenchGreeting = new HelloWorld() {
			String name = "tout le monde";
			public void greet() {
				greetSomeone("tout le monde");
			}
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Salut " + name);
			}
		};
		HelloWorld spanishGreeting = new HelloWorld() {
			String name = "mundo";
			public void greet() {
				greetSomeone("mundo");
			}
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hola " + name);
			}
		};
		englishGreeting.greet();
		frenchGreeting.greetSomeone("Seyoung");
		spanishGreeting.greet();
	}
	public static void main(String[] args) {
		HelloWorldAnonymousClass myApp = new HelloWorldAnonymousClass();
		myApp.sayHello();

	}

}
