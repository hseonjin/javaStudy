package question04;

public class Q6 {

	public static void main(String[] args) {
		// for문 이용하여 출력
		// *
		// **
		// ***
		// ****
		// *****
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}