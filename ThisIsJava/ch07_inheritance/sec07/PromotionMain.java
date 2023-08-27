package sec07;


// B, C -> A 상속
// D -> B 상속 (D는 A,B를 모두 가지게 된다)
// E -> C 상속 (E는 A,C를 모두 가지게 된다)
class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class PromotionMain {

	public static void main(String[] args) {
		// 상속 관계에 있으므로 자동 타입 변환
		A b = new B();
		A c = new C();
		B d = new D();
		C e = new E();
		
		// 상속 관계에 있지 않으므로 컴파일 에러 발생
		// B b2 = new E();
		// C c2 = new D();
	}

}
