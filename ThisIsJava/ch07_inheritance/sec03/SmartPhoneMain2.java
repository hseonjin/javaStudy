package sec03;

// Phone 클래스
class Phone2 {
	// 필드 선언
	public String model;
	public String color;

	// 매개변수를 갖는 생성자 선언
	public Phone2(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone2(String model, String color) 생성자 실행");
	}
}

// SmartPhone 클래스 (Phone 클래스 상속 받은 자식 클래스)
class SmartPhone2 extends Phone2 {

	// 필드 선언
	public boolean wifi;

	// 생성자 선언
	public SmartPhone2(String model, String color) { // Phone에서 상속받은 필드
		super(model, color); // 매개변수가 있는 경우 생략할 수 없음
		System.out.println("SmartPhone(String model, String color) 생성자 실행");
	}
}

// Main
public class SmartPhoneMain2 {

	public static void main(String[] args) {
		// SmartPhone 객체 생성
		SmartPhone2 myPhone = new SmartPhone2("갤럭시", "은색");

		// 상속받은 필드 읽기
		System.out.println(myPhone.model);
		System.out.println(myPhone.color);
	}

}
