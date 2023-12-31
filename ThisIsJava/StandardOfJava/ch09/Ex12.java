package ch09;

/*
메서드명 : getRand

 기 능 : 주어진 범위(from~to)에 속한 임의의 정수값을 반환한다.
 (양쪽 경계값 모두 범위에 포함)
 from의 값이 to의 값보다 클 경우도 처리되어야 한다.
 반환타입 : int
 
 매개변수 : int from - 범위의 시작값
 int to - 범위의 끝값
 
[Hint] Math.random()과 절대값을 반환하는 Math.abs(int a), 
그리고 둘 중에 작은 값을 반환하는 Math.min(int a, int b)를 사용하라
*/

class Ex12 {
	static int getRand(int from, int to) {
		return (int)(Math.random() * (Math.abs(to-from) + 1)) + Math.min(from, to);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++)
			System.out.print(getRand(1, -3) + ",");
	}
}

//2~8 랜덤값 구하기 Math.random * (8-2+1)) + 2