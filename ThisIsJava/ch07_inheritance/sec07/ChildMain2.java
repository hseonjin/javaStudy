package sec07;

class Parent2 {
	public String field1;
	
	public void method1() {
		System.out.println("Parent-method1()");
	}

	public void method2() {
		System.out.println("Parent-method2()");
	}
}

class Child2 extends Parent2 {
	public String field2;
	
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	public void method3() {
		System.out.println("Child-method3()");
	}
}

public class ChildMain2 {

	public static void main(String[] args) {
		Parent2 parent = new Child2(); // 부모 타입으로 자식 객체 생성
		
		// parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// parent.field2 = "data2"; // 자식 객체 필드이므로 접근 불가
		// parent.method3(); // 자식 객체 메소드이므로 접근 불가
		
		// 강제 타입 변환 
		Child2 child = (Child2) parent;
		
		// Child 타입으로 필드와 메소드 사용 가능
		child.field2 = "data2";
		child.method3();
	}

}
