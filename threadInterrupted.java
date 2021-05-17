
public class threadInterrupted{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread testThread = new Thread(() -> {
			int i =0;
			try {
				while(true) {
					System.out.println(i);
					Thread.sleep(10000);
				}
			}catch(InterruptedException e) {
				System.out.println(String.format("Current thread is Interrupted? %b\n", Thread.currentThread().isInterrupted()));
				Thread.currentThread().interrupt();
				System.out.println(String.format("Current thread is Interrupted? %b\n", Thread.currentThread().isInterrupted()));
			}
		}) ;
		testThread.start();
		testThread.interrupt();
	}
	
	
}
