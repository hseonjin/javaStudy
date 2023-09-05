package sec06;

import java.util.LinkedList;
import java.util.Queue;

class Message {
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}

public class QueueEx {

	public static void main(String[] args) {
		Queue<Message> queue = new LinkedList<>();
		
		queue.offer(new Message("sendMail", "홍길동"));
		queue.offer(new Message("sendSms", "김길동"));
		queue.offer(new Message("sendKakaotalk", "차길동"));
		
		while(!queue.isEmpty()) {
			Message message = queue.poll();
			switch(message.command) {
			case "sendMail": System.out.println(message.to + "님에게 메일을 보냅니다."); break;
			case "sendSms": System.out.println(message.to + "님에게 SMS를 보냅니다."); break;
			case "sendKakaotalk": System.out.println(message.to + "님에게 카카오톡을 보냅니다."); break;
			}
		}
	}

}
