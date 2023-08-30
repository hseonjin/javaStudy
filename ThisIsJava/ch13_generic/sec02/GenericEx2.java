package sec02;

// 상품 클래스
class Product<K, M> {
	private K kind;
	private M model;
	
	public K getKind() {return this.kind;}
	public M getModel() {return this.model;}
	public void setKind(K kind) {this.kind = kind;}
	public void setModel(M model) {this.model = model;}
}

// Tv2
class Tv2{}

// Car
class Car{}


public class GenericEx2 {

	public static void main(String[] args) {
		Product<Tv2, String> product1 = new Product<>(); // K->Tv2, M->String 대체
		product1.setKind(new Tv2());
		product1.setModel("스마트 Tv2");
		Tv2 Tv2 = product1.getKind();
		String Tv2Model = product1.getModel();
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("SUV 자동차");
		Car car= product2.getKind();
		String carModel = product2.getModel();
		
		System.out.println(Tv2Model);
		System.out.println(carModel);
	}

}
