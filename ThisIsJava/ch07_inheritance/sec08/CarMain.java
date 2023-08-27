package sec08;

class Tire {
	public void roll() {
		System.out.println("회전합니다.");
	}
}

class HankookTire extends Tire {
	@Override
	public void roll() {
		System.out.println("한국 타이어 회전");
	}
}

class KumhoTire extends Tire {
	@Override
	public void roll() {
		System.out.println("금호 타이어 회전");
	}
}

class Car {
	public Tire tire;

	public void run() {
		tire.roll();
	}
}

public class CarMain {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.tire = new Tire();
		myCar.run(); // 회전합니다
		
		myCar.tire = new HankookTire();
		myCar.run(); // 한국 타이어 회전
		
		myCar.tire = new KumhoTire();
		myCar.run(); // 금호 타이어 회전
	}
}
