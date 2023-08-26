package ch03;

public class Ex07 {

	public static void main(String[] args) {
		// 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C = 5/9 × (F - 32)'
		// 변환 결과값은 소수점 셋째자리에서 반올림
		
		int fahrenheit = 100;
		float celcius = (5/9f * (fahrenheit - 32));
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+ String.format("%.2f", celcius));

	}

}
