package week_3_1;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box1 = new Box<String> ();
		box1.set("hello");
		String str = box1.get();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		int value = box2.get();
		
		System.out.println(str+" "+value);
	}

}
