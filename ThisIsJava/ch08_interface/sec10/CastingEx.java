package sec10;

interface Vehicle {
	void run();
}

class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다");
	}
	
	// 추가 메소드
	public void checkFare() {
		System.out.println("승차요금을 체크합니다");
	}
}

public class CastingEx {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		// 구현 객체의 메소드를 호출하기 위해 강제 타입 변환
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
	}

}
