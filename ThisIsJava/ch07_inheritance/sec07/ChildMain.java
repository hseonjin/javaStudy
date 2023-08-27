package sec07;

class Parent {
	public void method1() {
		System.out.println("Parent-method1()");
	}

	public void method2() {
		System.out.println("Parent-method2()");
	}
}

class Child extends Parent {
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	public void method3() {
		System.out.println("Child-method3()");
	}
}

public class ChildMain {

	public static void main(String[] args) {
		Parent child = new Child(); // 부모 타입으로 자식 객체 생성
		
		// method2()가 자식 클래스에서 오버라이딩되었으므로 자식 클래스의 method2()를 호출한다
		child.method1();
		child.method2();
		
		// 타입 변환으로 인해 부모 클래스에만 접근 가능하므로 자식 클래스에서 정의된 메소드는 호출할 수 없다
		// child.method3();
	}

}
