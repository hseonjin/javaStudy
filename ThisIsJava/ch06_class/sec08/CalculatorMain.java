package sec08;

class Calculator {
	// 리턴값이 없는 메소드
	void powerOn() {
		System.out.println("전원 On");
	}
	
	void powerOff() {
		System.out.println("전원 off");
	}
	
	// 호출되면 연산하여 호출한 곳으로 결과값 result를 리턴하는 메소드
	int plus (int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
}

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.powerOn();
		
		System.out.println(calc.plus(1, 2));
		System.out.println(calc.divide(10, 2));
		
		calc.powerOff();
	}

}
