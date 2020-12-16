package ex06_간단한자료구조수업;

import java.util.LinkedList;
import java.util.Queue;

class Message{
	String commad;
	String to;
	
	public Message(String commad, String to) {
		this.commad = commad;
		this.to = to;
	}
	
	
}

public class TestQueue {

	public static void main(String[] args) {
		
		//java Queue = interface라서 객체선언 할 수 없다
		//enQueue() - offer()
		//deQueue() - poll()
		//LinkedList<>() new해서 Queue 운용법으로 사용!!
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sandMail", "홍길동"));
		messageQueue.offer(new Message("sandSMS", "홍길동"));
		messageQueue.offer(new Message("sandKakaotalk", "홍길동"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			System.out.println("메세지 전송방식" + message.commad);
			System.out.println("메세지 전송대상" + message.to);
			System.out.println();
			
		}
	}

}
