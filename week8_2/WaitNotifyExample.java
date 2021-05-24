package week8_2;

public class WaitNotifyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBox dataBox = new DataBox();
		
		ProducerThread pt = new ProducerThread(dataBox);
		ConsumerThread ct = new ConsumerThread(dataBox);
		
		pt.start();
		ct.start();
	}

}
