package sec02;

class Box2<T> {
	public T content;
	
	// Box2의 내용물이 같은지 비교
	public boolean compare(Box2<T> other) {
		boolean result = content.equals(other.content);
		return result;
	}
}

public class GenericEx4 {

	public static void main(String[] args) {
		Box2 box1 = new Box2();
		box1.content = "100";

		Box2 box2 = new Box2();
		box2.content = "100";
		
		Box2 box3 = new Box2();
		box3.content = 100;

		boolean result1 = box1.compare(box2);
		System.out.println("result1: " + result1);

		boolean result2 = box1.compare(box3);
		System.out.println("result2: " + result2);
	}

}
