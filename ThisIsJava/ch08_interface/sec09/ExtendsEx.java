package sec09;

// 인터페이스 1
interface InterfaceA {
	void methodA();
}

// 인터페이스 2
interface InterfaceB {
	void methodB();
}

// 인터페이스1,2를 상속받은 자식 인터페이스
interface InterfaceC extends InterfaceA, InterfaceB{
	void methodC();
}

// 구현객체
class InterfaceCImpl implements InterfaceC {
	public void methodA() {
		System.out.println("interfaceCImpl-methodA() 실행");
	}
	public void methodB() {
		System.out.println("interfaceCImpl-methodB() 실행");
	}
	public void methodC() {
		System.out.println("interfaceCImpl-methodC() 실행");
	}
}

public class ExtendsEx {

	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		InterfaceA ia = impl;
		ia.methodA();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		InterfaceC ic = impl;
		ic.methodA(); // InterfaceA에서 상속 받은 메소드
		ic.methodB(); // InterfaceB에서 상속 받은 메소드
		ic.methodC();
		
	}

}
