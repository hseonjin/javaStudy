package sec04;

// Calculator 클래스
class Calculator {
	// 메소드
	public double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}

// Computer 클래스
class Computer extends Calculator{
	// 메소드 오버라이딩
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}

public class ComputerMain {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원 면적: " + calculator.areaCircle(r));
		
		Computer myCom = new Computer();
		System.out.println("원 면적: " + myCom.areaCircle(r));

	}

}
