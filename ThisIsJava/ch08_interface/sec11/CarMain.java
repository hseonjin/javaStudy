package sec11;

class Tire {
	public void roll() {
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
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();
	
	public void run() {
		tire1.roll();
		tire2.roll();
	}
}

public class CarMain {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		// 타이어 객체 교체
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();
		
		myCar.run();
	}
}
