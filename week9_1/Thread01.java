package week9_1;

public class Thread01 extends Thread{
	public void run() {
		for(int i =0;i<5;i++) {
			System.out.println("시작합니다 " + i);
			if(i==1)
				Thread.yield();
		}
	}
}
