package question05;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// 학생들의 점수를 분석하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		int[] scores = null;
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택 > ");
			
			int menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1:
				System.out.println("학생수: ");
				cnt = Integer.parseInt(sc.nextLine());
				scores = new int[cnt];
			case 2:
				for(int i=0; i<cnt; i++) {
					System.out.println("scores[" + i + "] > ");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			case 3:
				for(int i=0; i<cnt; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			case 4:
				int maxScore = 0;
				int scoreCnt = 0;
				for(int i=0; i<scores.length; i++) {
					if(maxScore < scores[i]) maxScore = scores[i];
					scoreCnt++;
				}
				System.out.println("최고점수: " + maxScore);
				System.out.println("평균점수: " + (double)maxScore/scoreCnt);
			case 5: 
				run = false;
				break;
			}
		}
	}

}
