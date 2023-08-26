package question04;

public class Q5 {

	public static void main(String[] args) {
		// 중첩 for문을 이용하여 방정식 4x+5y=60의 모든 해를 구하여 (x, y) 형태로 출력
		// 단, x, y <= 10인 자연수

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60)
					System.out.printf("(%d, %d)", x, y);
			}
		}
	}
}