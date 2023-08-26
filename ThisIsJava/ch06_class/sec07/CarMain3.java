package sec07;

class Car3 {
	// 필드 선언
	String model;
	String color;
	int maxSpeed;

	// 생성자 선언
	// 기본 생성자
	Car3() {
	}

	// model만 초기화하는 생성자
	Car3(String model) {
		this(model, "은색", 250);
	}

	// model과 color를 초기화하는 생성자
	Car3(String model, String color) {
		this(model, color, 250);
	}

	// #1 모든 필드를 초기화하는 생성자 (공통코드로 사용되는 생성자)
	Car3(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

public class CarMain3 {
	public static void main(String[] args) {
		Car3 myCar = new Car3();
		System.out.println("모델명: " + myCar.model);
		System.out.println("색상: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);

		System.out.println("-----------");

		Car3 myCar2 = new Car3("그랜저");
		System.out.println("모델명: " + myCar2.model);
		System.out.println("색상: " + myCar2.color);
		System.out.println("최고속도: " + myCar2.maxSpeed);

		System.out.println("-----------");

		Car3 myCar3 = new Car3("지바겐", "red");
		System.out.println("모델명: " + myCar3.model);
		System.out.println("색상: " + myCar3.color);
		System.out.println("최고속도: " + myCar3.maxSpeed);

		System.out.println("-----------");

		Car3 myCar4 = new Car3("투싼", "black", 300);
		System.out.println("모델명: " + myCar4.model);
		System.out.println("색상: " + myCar4.color);
		System.out.println("최고속도: " + myCar4.maxSpeed);
	}

}
