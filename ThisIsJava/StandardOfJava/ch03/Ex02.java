package ch03;

public class Ex02 {

	public static void main(String[] args) {
		// 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = (numOfApples / sizeOfBucket) 
				+ ((numOfApples % sizeOfBucket == 0) ? 0 : 1); // 모든 사과를 담는데 필요한 바구니의
																									// 수
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
	}

}
