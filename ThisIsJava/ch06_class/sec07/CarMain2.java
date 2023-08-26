package sec07;

class Car2 {
	// 필드 선언
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 선언
	// 기본 생성자
	Car2() {}
	
	// model만 초기화하는 생성자
	Car2(String model) {
		this.model = model;
	}
	// model과 color를 초기화하는 생성자
	Car2(String model, String color){
		this.model = model;
		this.color = color;
	}
	// 모든 필드를 초기화하는 생성자
	Car2(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

public class CarMain2 {
	public static void main(String[] args) {
		Car2 myCar = new Car2(); 
		System.out.println("모델명: " + myCar.model);
		System.out.println("색상: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		
		System.out.println("-----------");
		
		Car2 myCar2 = new Car2("그랜저"); 
		System.out.println("모델명: " + myCar2.model);
		System.out.println("색상: " + myCar2.color);
		System.out.println("최고속도: " + myCar2.maxSpeed);
		
		System.out.println("-----------");

		Car2 myCar3 = new Car2("지바겐", "red"); 
		System.out.println("모델명: " + myCar3.model);
		System.out.println("색상: " + myCar3.color);
		System.out.println("최고속도: " + myCar3.maxSpeed);
		
		System.out.println("-----------");
		
		Car2 myCar4 = new Car2("투싼", "black", 300); 
		System.out.println("모델명: " + myCar4.model);
		System.out.println("색상: " + myCar4.color);
		System.out.println("최고속도: " + myCar4.maxSpeed);
		
	}

}
