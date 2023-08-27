package sec08;

// 인터페이스 1
interface RemoteControl {
	// 추상메소드
	void turnOn();
	void turnOff();
}

// 인터페이스 2
interface Searchable {
	// 추상메소드
	void search(String url);
}

// 구현 클래스
class SmartTv implements RemoteControl, Searchable {
	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다");
	}
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다");
	}
}

public class MultiInterfaceMain {

	public static void main(String[] args) {
		// 인터페이스 1에 선언된 추상 메소드 호출
		RemoteControl rc = new SmartTv();
		rc.turnOn();
		rc.turnOff();
		
		// 인터페이스 2에 선언된 추상 메소드 호출
		Searchable sc = new SmartTv();
		sc.search("https://www.youtube.com");
		
	}

}
