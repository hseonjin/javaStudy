package sec10;

abstract class Animal {
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}

	// 추상 메소드 선언
	public abstract void sound();
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

public class AbstractMethodEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();

		Cat cat = new Cat();
		cat.sound();
		
		// 매개변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
