package question06;

// 클래스 선언하기
public class Q13 {
// public class Member {
	String name;
	String id;
	String password;
	int age;

	Q13(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		// 생성자 추가
		Q13 member = new Q13("홍길동", "hong");
		System.out.println(member.name);
		System.out.println(member.id);
	}
}
