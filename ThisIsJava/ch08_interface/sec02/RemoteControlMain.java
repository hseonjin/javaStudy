package sec02;

// 클래스
class Tv implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다");
	}
}
class Radio implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("라디오를 켭니다");
	}
}

// 인터페이스
interface RemoteControl {
	// public 추상 메소드
	public void turnOn();
}

// 메인클래스
public class RemoteControlMain {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Tv();
		rc.turnOn();
		
		RemoteControl rc2;
		rc2 = new Radio();
		rc2.turnOn();
	}
}
