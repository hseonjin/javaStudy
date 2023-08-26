package question04;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// while문과 Scanner의 nextLine()를 사용하여 예금, 출금, 조회, 종료 기능 제공하는 코드 작성
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("-----------------------------");
			System.out.println("선택 > ");

			int menuNum = Integer.parseInt(sc.nextLine());

			switch (menuNum) {
			case 1:
				System.out.println("예금액> ");
				balance += Integer.parseInt(sc.nextLine());;
				break;
			case 2:
				System.out.println("출금액> ");
				balance -= Integer.parseInt(sc.nextLine());;
				break;
			case 3:
				System.out.println("잔고> " + balance);
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
	}
}