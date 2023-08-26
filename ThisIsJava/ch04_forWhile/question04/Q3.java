package question04;

public class Q3 {

	public static void main(String[] args) {
		// for문을 이용하여 1부터 100까지의 정수 중 3의 배수의 총합을 출력하는 코드 작성
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
