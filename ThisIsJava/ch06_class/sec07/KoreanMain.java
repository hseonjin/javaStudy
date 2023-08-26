package sec07;

class Korean {
	// 필드 선언
	String nation = "대한민국";
	String name;
	int age;
	
	// 생성자 선언
	Korean(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class KoreanMain {

	public static void main(String[] args) {
		Korean korean = new Korean("홍길동", 30);
		
		System.out.println(korean.nation);
		System.out.println(korean.name);
		System.out.println(korean.age);
		
		Korean korean2 = new Korean("김길동", 40);
		
		System.out.println(korean2.nation);
		System.out.println(korean2.name);
		System.out.println(korean.age);
	}

}
