package sec03;

class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) { // obj가 Member 타입인지 검사
			Member mem = (Member) obj; // 업캐스팅
			if (id.equals(mem.id)) {
				return true;
			}
		}
		return false;
	}
}

public class EqualsEx {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 ojb2는 동등하다");
		} else {
			System.out.println("obj1과 ojb2는 동등하지 않다");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 ojb3는 동등하다");
		} else {
			System.out.println("obj1과 ojb3는 동등하지 않다");
		}
	}
}
