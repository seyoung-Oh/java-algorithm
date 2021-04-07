package week5;
import java.util.*;
public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail","È«±æµ¿"));
		messageQueue.offer(new Message("sendSMS","È«µÎ²²"));
		messageQueue.offer(new Message("sendKakaotalk","Á¤¿øÈ£"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to+"´Ô¿¡°Ô ¸ÞÀÏÀ» º¸³À´Ï´Ù.");
				break;
			case "sendSMS":
				System.out.println(message.to+"´Ô¿¡°Ô SMSÀ» º¸³À´Ï´Ù.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to+"´Ô¿¡°Ô KakaotalkÀ» º¸³À´Ï´Ù.");
				break;
			}
		}
	}

}
