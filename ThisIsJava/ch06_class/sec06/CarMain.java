package sec06;

class Car {
	// 필드 선언
	String model;
	boolean start;
	int speed;
}

public class CarMain {
	public static void main(String[] args) {
		Car myCar = new Car(); // Car 객체 생성
		
		System.out.println("모델명: " + myCar.model);
		System.out.println("시동여부: " + myCar.start);
		System.out.println("현재속도: " + myCar.speed);
	}

}
