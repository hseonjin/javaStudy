package sec03_07;

// 인터페이스
interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
}

public class RemoteControlMain {

	public static void main(String[] args) {
		System.out.println("최대 볼륨: " + RemoteControl.MAX_VOLUME);
		System.out.println("최소 볼륨: " + RemoteControl.MIN_VOLUME);
	}

}
