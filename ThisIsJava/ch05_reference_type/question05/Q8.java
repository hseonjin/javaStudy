package question05;

public class Q8 {

	public static void main(String[] args) {
		// 배열 항목의 전체 합과 평균을 구하여 출력하는 코드 작성

		int[][] array = { 
				{ 95, 86 }, 
				{ 83, 92, 96 }, 
				{ 78, 83, 93, 87, 88 } 
		};
		
		int sum = 0;
		int cnt = 0;
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				cnt += 1;
			}
		}
		System.out.println("합: " + sum);
		System.out.println("평균: " + (double)sum/cnt);
	}

}
