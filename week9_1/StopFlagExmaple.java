package week9_1;

public class StopFlagExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintThread1 pt = new PrintThread1();
		pt.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}
		
		pt.setStop(true);
	}

}
