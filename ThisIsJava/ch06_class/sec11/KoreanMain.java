package sec11;

class Korean {
	// final 필드 선언
	final String nation = "대한민국";
	final String ssn;
	
	String name;
	
	// 생성자 선언
	Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}

public class KoreanMain {

	public static void main(String[] args) {
		// 생성자에서 초기값을 대입하는 방법
		Korean korean = new Korean("123456-1234567", "홍길동");
		
		System.out.println(korean.nation);
		System.out.println(korean.ssn);
		System.out.println(korean.name);
		
		// korean.nation = "일본"; // final 필드는 값을 변경할 수 없음
		korean.name = "전우치";
		System.out.println(korean.name);

	}

}
