package week8_2;

public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SunThread sumThread = new SunThread();
		sumThread.start();
		
		try {
			sumThread.join();
		}catch(InterruptedException e) {
			
		}
		System.out.println("1~100гу : " + sumThread.getSum());
		
	}

}
