package ch07;

// 부모클래스
class Robot {
}

// 자식객체1
class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

//자식객체2
class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

//자식객체3
class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

public class Ex18 {

	public static void action(Robot r) {
		if (r instanceof DanceRobot) {
			((DanceRobot) r).dance();
		} else if (r instanceof SingRobot) {
			((SingRobot) r).sing();
		} else if (r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		}
	}

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
	}

}
