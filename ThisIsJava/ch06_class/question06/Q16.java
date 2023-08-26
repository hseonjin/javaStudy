package question06;

class Printer {
	void println (int value) {
		System.out.println("int: " + value);
	}
	void println (boolean value) {
		System.out.println("boolean: " + value);
	}
	void println (double value) {
		System.out.println("double: " + value);
	}
	void println (String value) {
		System.out.println("String: " + value);
	}
}

public class Q16 {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}
}
