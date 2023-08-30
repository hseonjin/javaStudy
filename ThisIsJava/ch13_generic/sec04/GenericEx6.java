package sec04;

class Box<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class GenericEx6 {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setT(t);;
		return box;
	}

	public static void main(String[] args) {
	Box<Integer> box1 = boxing(100);
	int intValue = box1.getT();
	System.out.println(intValue);
	
	Box<String> box2 = boxing("hi");
	String strValue = box2.getT();
	System.out.println(strValue);
	}
}
