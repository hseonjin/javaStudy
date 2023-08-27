package ch07;

class Buyer {
	int money = 1000; // 가진 돈
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product배열 cart에 사용될 index

	void buy(Product p) {
		// 가진 돈과 물건의 가격을 비교
		// 가진 돈이 적으면 메서드 종료
		// 가진 돈이 충분하면 제품의 가격을 가진 돈에서 빼고
		// add 메서드를 호출하여 장바구니에 구입한 물건을 담는다
		if (money < p.price) {
			System.out.println("잔액이 부족하여 " + p.toString() + "을/를 살 수 없습니다.");
			return;
		} else {
			money -= p.price;
			add(p);
		}
	}

	void add(Product p) {
		// i의 값이 장바구니의 크기보다 같거나 크면 기존의 장바구니보다 2배 큰 새로운 배열을 생성
		// 기존의 장바구니의 내용을 새로운 배열에 복사
		// 새로운 장바구니와 기존의 장바구니를 바꾼다
		// 물건을 장바구니(cart)에 저장하고 i 값을 1 증가시킨다
		if (i >= cart.length) {
			Product[] newCart = new Product[cart.length * 2];
			System.arraycopy(cart, 0, newCart, 0, i);
			cart = newCart;
		}
		cart[i++] = p;
	}

	void summary() {
		// 장바구니에 담긴 물건들의 목록을 만들어 출력
		// 장바구니에 담긴 물건의 가격을 모두 더해 출력
		// 물건을 사고 남은 금액 출력
		int tot = 0;
		String pname = "";
		for (int k = 0; k < i; k++) {
			tot += cart[k].price;
			pname += cart[k].toString() + ",";
		}
		System.out.println("구입한 물건: " + pname + "\n사용한 금액: " + tot + "\n남은 금액: " + money);

	}
}

class Product {
	int price; // 제품의 가격

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

class Ex19 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}
}