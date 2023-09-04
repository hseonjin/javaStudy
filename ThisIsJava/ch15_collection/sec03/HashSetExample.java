package sec03;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("JSP");
		set.add("JAVA"); // 중복 객체이므로 저장하지 않음
		set.add("Spring");
		
		int size = set.size();
		System.out.println(size);
	}
}
