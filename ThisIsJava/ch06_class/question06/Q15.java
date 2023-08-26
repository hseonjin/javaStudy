package question06;

class MemberService {
	String id;
	String password;
	
	// 메소드
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}

public class Q15 {
	public static void main(String[] args) {
		MemberService mem = new MemberService();
		
		boolean result = mem.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			mem.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
