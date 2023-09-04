package sec03;

import java.util.HashSet;
import java.util.Set;

class Member1 {
	public String name;
	public int age;
	
	public Member1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// hashCode 재정의 - name과 age 값이 같으면 동일한 hashCode 리턴
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	// equals 재정의 - name과 age 값이 같으면 true 리턴
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member1) {
			Member1 target = (Member1) obj;
			return target.name.equals(name) && (target.age == age);
		} else {
			return false;
		}
	}
}

public class HashSetExample2 {
	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		Set<Member1> set = new HashSet<Member1>();
		
		//Member 객체 저장
		set.add(new Member1("홍길동", 30));
		set.add(new Member1("홍길동", 30)); // 인스턴스는 다르지만 동등 객체이므로 객체 1개만 저장

		//저장된 객체 수 출력
		System.out.println("총 객체 수 : " + set.size());
	}
}
