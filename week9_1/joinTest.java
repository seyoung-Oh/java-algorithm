package week9_1;

public class joinTest extends Thread{
	private int first, last;
	public int sum;
	
	public joinTest(int first, int last) {
		this.first = first;
		this.last = last;
	}
	
	public void run() {
		for(int i = first; i <= last; i++) {
			sum = sum+i;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		joinTest th1 = new joinTest(1,5);
		joinTest th2 = new joinTest(6,10);
		
		th1.start();
		th2.start();
		
		try {
			th1.join();
			th2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("th1 sum : " + th1.sum);
		System.out.println("th2 sum : " + th2.sum);
		System.out.println("total sum : " + (th1.sum+th2.sum));
	}

}
