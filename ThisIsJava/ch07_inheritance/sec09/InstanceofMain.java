package sec09;

class Person2 {
	public String name;
	
	public Person2(String name) {
		this.name = name;
	}
	
	public void walk() {
		System.out.println("걷는다");
	}
}

class Student extends Person2 {
	public int studentNo;
	
	public Student(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
	
	public void study() {
		System.out.println("공부한다");
	}
}

public class InstanceofMain {
	public static void Person2Info(Person2 Person2) {
		System.out.println("name: " +Person2.name);
		Person2.walk();
		
		// Person2이 참조하는 객체가 Student 타입인지 확인
		if(Person2 instanceof Student) {
			// student인 경우 강제 타입 변환
			Student student = (Student) Person2;
			// student 객체만 가지고 있는 필드 및 메소드 사용
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}
		
		// java12부터 사용 가능
		// Person2이 참조하는 객체가 Student 타입인 경우
		// student 변수에 대입 (타입 변환)
//		if(Person2 instanceof Student student) {
//			System.out.println("studentNo: " + student.studentNo);
//			student.study();
//		}
	}
	
	public static void main(String[] args) {
		// Person2 객체를 매개값으로 제공하고 메소드 호출
		Person2 p1 = new Person2("홍길동");
		Person2Info(p1);
		
		System.out.println();
		
		// Student 객체를 매개값으로 제공하고 메소드 호출
		Person2 p2 = new Student("김길동", 10);
		Person2Info(p2);
		
	}

}
