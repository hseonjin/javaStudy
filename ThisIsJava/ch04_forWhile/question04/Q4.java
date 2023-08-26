package question04;

public class Q4 {

	public static void main(String[] args) {
		// while문과 Math.random()을 사용하여 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력
		// 눈의 합이 5가 아니라면 계속 주사위를 던지고, 눈의 합이 5라면 실행을 멈춘다
		
		int a, b;
		while(true) {
			a = (int)(Math.random()*6) + 1;
			b = (int)(Math.random()*6) + 1;
			System.out.printf("(%d, %d)", a, b);
			if (a + b == 5) break;
		}
	}

}
