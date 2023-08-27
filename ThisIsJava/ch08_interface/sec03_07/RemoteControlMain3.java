package sec03_07;

// 인터페이스
interface RemoteControl3 {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상메소드
	void turnOn();

	void turnOff();

	void setVolume(int volume);
	
	// 디폴트 인스턴스 메소드
	default void setMete(boolean mute) {
		if(mute) {
			System.out.println("무음처리");
			setVolume(MIN_VOLUME); // 추상메소드 호출
		} else {
			System.out.println("무음해제");
		}
	}
	
	// 정적 메소드
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
}

// 구현클래스
class Tv2 implements RemoteControl3 {
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
			this.volume = RemoteControl3.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl3.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 티비 볼륨: " + this.volume);
	}
}

public class RemoteControlMain3 {

	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl3 rc = new Tv2();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		// 디폴트 메소드 호출
		rc.setMete(true);
		rc.setMete(false);
		
		RemoteControl3.changeBattery();
	}

}
