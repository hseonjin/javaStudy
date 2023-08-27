package sec03_07;

// 인터페이스
interface RemoteControl2 {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상메소드
	void turnOn();

	void turnOff();

	void setVolume(int volume);
}

// 구현클래스
class Tv implements RemoteControl2 {
	private int volume;

	// 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl2.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl2.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 티비 볼륨: " + this.volume);
	}
}

class Radio implements RemoteControl2 {
	private int volume;

	// 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("라디오를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("라디오를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl2.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl2.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 라디오 볼륨: " + this.volume);
	}
}

public class RemoteControlMain2 {

	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl2 rc = new Tv();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		RemoteControl2 rc2 = new Radio();
		rc2.turnOn();
		rc2.setVolume(10);
		rc2.turnOff();
	}

}
