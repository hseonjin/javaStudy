package sec08;

class Computer {
	// 가변길이 매개변수를 갖는 메소드
	int sum(int ... values) {
		int sum = 0;
		
		// values는 배열 타입의 변수처럼 사용
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}

public class ComputerMain {

	public static void main(String[] args) {
		Computer com = new Computer();
		
		int result1 = com.sum(1,2,3);
		System.out.println(result1);
		
		int result2 = com.sum(1,2,3,4,5);
		System.out.println(result2);
		
		int result3 = com.sum(1,2,3,4,5,6,7,8,9,10);
		System.out.println(result3);

	}

}
