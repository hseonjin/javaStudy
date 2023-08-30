package sec03;

class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {return no;}
	public String getName() {return name;}
	
	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj;
			if (no == stu.getNo() && name.equals(stu.getName())) { // 학생 번호와 이름이 같으면 true
				return true;
			}
		}
		return false;
	}
}

public class HashCodeEx {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		
		if(s1.hashCode()==s2.hashCode()) { // 해시코드 동일성 검사
			if(s1.equals(s2)) { // 데이터 동일성 검사
				System.out.println("동등");
			} else {
				System.out.println("데이터가 달라 동등하지 않음");
			}
		} else {
			System.out.println("해시코드가 달라 동등하지 않음");
		}
	}

}
