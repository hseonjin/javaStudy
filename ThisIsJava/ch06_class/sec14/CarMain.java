package sec14;

class Car {
	private int speed;
	private boolean stop;
	
	//getter, setter 선언
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}
}

public class CarMain {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		// 잘못된 코드
		myCar.setSpeed(-50);
		System.out.println(myCar.getSpeed());
		
		// 바른 코드
		myCar.setSpeed(60);
		System.out.println(myCar.getSpeed());
		
		// 멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println(myCar.getSpeed());
	}

}
