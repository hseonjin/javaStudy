package ch06;

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	// 생성자
	Student() {
	}

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// 메서드
	public int getTotal() {
		return kor + eng + math;
	}

	public float getAverage() {
		float avg = (float) getTotal() / 3;
		return Math.round(avg * 10) / 10.0f;
	}

	public String info() { 
		return String.format("%s, %d, %d, %d, %d, %d, %d, %f", 
				name, ban, no, kor, eng, math, getTotal(), getAverage());
	}
}

public class Ex03_04_05 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());

		Student s1 = new Student("홍길동", 1, 1, 100, 60, 76);
		System.out.println(s1.info());
	}
}
