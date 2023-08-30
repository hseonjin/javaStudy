package sec02;

// Rentable 인터페이스
interface Rentable<P> {
	P rent();
}

class Home {
	public void turnOnLight() {
		System.out.println("전등을 켭니다");
	}
}

class Car2 {
	public void run() {
		System.out.println("차가 달립니다");
	}
}

// 렌트 대리점
class homeAgency implements Rentable<Home> { // 파라미터 타입 P를 Home으로 대체
	public Home rent() {
		return new Home(); // 리턴타입이 Home이어야 함
	}
}

class carAgency implements Rentable<Car2> { // 파라미터 타입 P를 Home으로 대체
	public Car2 rent() {
		return new Car2(); // 리턴타입이 Home이어야 함
	}
}

public class GenericEx3 {

	public static void main(String[] args) {
		homeAgency homeAgency = new homeAgency();
		Home home = homeAgency.rent();
		home.turnOnLight();
		
		carAgency carAgency = new carAgency();
		Car2 car = carAgency.rent();
		car.run();
	}

}
