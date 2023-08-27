package sec02;

// Phone 클래스
class Phone {
	// 필드 선언
	public String model;
	public String color;
	
	// 메소드 선언
	public void bell() {
		System.out.println("벨이 울립니다");
	}
	
	public void sendVoice(String message) {
		System.out.println("자기: " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대: " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다");
	}
}

// SmartPhone 클래스 (Phone 클래스 상속 받은 자식 클래스)
class SmartPhone extends Phone{

	// 필드 선언
	public boolean wifi;
	
	// 생성자 선언
	public SmartPhone(String model, String color) { // Phone에서 상속받은 필드
		this.model = model;
		this.color = color;
	}
	
	// 메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결");
	}

}

// Main
public class SmartPhoneMain {

	public static void main(String[] args) {
		// SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		// 상속받은 필드 읽기
		System.out.println(myPhone.model);
		System.out.println(myPhone.color);
		
		//SmartPhone의 필드 읽기
		System.out.println(myPhone.wifi);
		
		// 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("하이, 나 홍길동임");
		myPhone.sendVoice("오랜만이다");
		myPhone.hangUp();
		
		// SmartPhone의 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
