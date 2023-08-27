package sec11;

class Vehicle {
	public void run() {
	}
}

class Bus extends Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}

class Taxi extends Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}

class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

public class DriverMain {

	public static void main(String[] args) {
		// Driver 객체 생성
		Driver driver = new Driver();
		
		// 매개값으로 Bus 객체를 제공하고 driver() 메소드 호출
		Bus bus = new Bus();		
		Taxi taxi = new Taxi();		
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
