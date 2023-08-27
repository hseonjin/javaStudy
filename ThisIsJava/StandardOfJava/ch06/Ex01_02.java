package ch06;

// SutdaCard클래스를 정의하라.

class SutdaCard {
	// 필드
	int num = 1;
	boolean isKwang = true;
	
	// 생성자
	public SutdaCard() {};
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	};
	
	// 메소드
	public String info() {
		return num + (isKwang ? "K" : "");
	}
	
}

public class Ex01_02 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(5, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}
