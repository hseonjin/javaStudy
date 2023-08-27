package sec03;

// Phone 클래스
class Phone {
	// 필드 선언
	public String model;
	public String color;
	
	// 기본 생성자 선언
	public Phone() {
		System.out.println("Phone() 생성자 실행");
	}
}

// SmartPhone 클래스 (Phone 클래스 상속 받은 자식 클래스)
class SmartPhone extends Phone{

	// 필드 선언
	public boolean wifi;
	
	// 생성자 선언
	public SmartPhone(String model, String color) { // Phone에서 상속받은 필드
		super(); // 생략 가능
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone(String model, String color) 생성자 실행");
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
	}

}
