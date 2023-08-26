package sec08;

class Calculator2 {
	
	// 오버로딩: 메소드명 같고, 매개변수가 다름
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}

public class CalculatorMain2 {

	public static void main(String[] args) {
		Calculator2 cal = new Calculator2();
		
		double result = cal.areaRectangle(3);
		double result2 = cal.areaRectangle(3, 5);
		
		System.out.println(result);
		System.out.println(result2);
	}
}