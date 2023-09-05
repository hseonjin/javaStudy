package sec05;

import java.util.TreeSet;

class PersonEx implements Comparable<PersonEx> {
	public String name;
	public int age;

	public PersonEx(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(PersonEx o) {
		if (age < o.age)
			return -1; // 작으면 -1
		else if (age == o.age)
			return 0; // 같으면 0
		else
			return 1; // 크면 1
	}
}

public class ComparableEx {
	public static void main(String[] args) {
		TreeSet<PersonEx> treeSet = new TreeSet<PersonEx>();

		treeSet.add(new PersonEx("홍길동", 45));
		treeSet.add(new PersonEx("김길동", 26));
		treeSet.add(new PersonEx("차길동", 30));

		for (PersonEx PersonEx : treeSet) {
			System.out.println(PersonEx.name + ":" + PersonEx.age);
		}
	}
}
