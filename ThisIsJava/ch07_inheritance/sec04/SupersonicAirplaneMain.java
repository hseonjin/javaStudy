package sec04;

class Airplane {
	// 메소드 선언
	public void land() {
		System.out.println("착륙합니다");
	}
	
	public void fly() {
		System.out.println("일반 비행합니다");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다");
	}
}

class SupersonitAirplane extends Airplane{
	// 상수 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	// 상태 필드 선언
	public int flyMode = NORMAL;
	
	// 메소드 재정의
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			// Airplane 객체의 fly() 메소드 호출
			super.fly();
		}
	}
}

public class SupersonicAirplaneMain {

	public static void main(String[] args) {
		SupersonitAirplane sa = new SupersonitAirplane();
		
		sa.takeOff();
		
		sa.fly();
		
		sa.flyMode = SupersonitAirplane.SUPERSONIC;
		sa.fly();
		
		sa.flyMode = SupersonitAirplane.NORMAL;
		sa.fly();
		
		sa.land();
	}

}
