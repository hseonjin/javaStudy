package sec15;

class Singleton {
	// private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();

	// private 접근 권한을 갖는 생성자 선언
	private Singleton() {
	}

	// public 접근 권한을 갖는 정적 메소드 선언
	// 정적 메소드를 public으로 선언하여 정적 필드값을 리턴할 수 있다
	// -> 외부에서 객체를 얻는 유일한 방법
	public static Singleton getInstance() {
		return singleton;
	}
}

public class SingletonMain {

	public static void main(String[] args) {
		// 정적 메소드를 호출하여 싱글톤 객체를 얻을 수 있다
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		// 동일한 객체를 참조하는지 확인
		if (obj1 == obj2) {
			System.out.println("같은 singleton 객체입니다");
		} else {
			System.out.println("다른 singleton 객체입니다");

		}
	}

}
