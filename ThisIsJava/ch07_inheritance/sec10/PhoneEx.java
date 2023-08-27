package sec10;


abstract class Phone {
	String owner;
	
	Phone(String owner) {
		this.owner = owner;
	}
	
	void turnOn() {
		System.out.println("전원을 켭니다");
	}
	void turnOff() {
		System.out.println("전원을 끕니다");
	}
}

class SmartPhone extends Phone {
	SmartPhone(String owner) {
		super(owner); // Phone의 생성자 호출
	}
	
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}
}

public class PhoneEx {

	public static void main(String[] args) {
		// Phone 객체는 new 연산자로 직접 생성할 수 없지만 
		// 자식 객체인 SmartPhone을 new 연산자로 생성하여 상속받은 메소드를 호출할 수 있다
		
		SmartPhone myPhone = new SmartPhone("홍길동");
		
		myPhone.turnOn();
		myPhone.internetSearch();
		myPhone.turnOff();
	}

}
