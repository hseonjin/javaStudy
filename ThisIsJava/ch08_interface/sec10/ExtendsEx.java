package sec10;

// 인터페이스 1
interface A {
}
 
// 구현 객체
class B implements A{
}

// 구현 객체
class C implements A{
}

// 자식 객체
class D extends B{
}

// 자식 객체
class E extends C{
}


public class ExtendsEx {

	public static void main(String[] args) {
		// 구현 객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 인터페이스 변수 선언
		A a;
		
		// 변수에 구현 객체 대입
		a = b; // A <- B
		a = c; // A <- C
		a = d; // A <- D
		a = e; // A <- E
		
		
	}

}
