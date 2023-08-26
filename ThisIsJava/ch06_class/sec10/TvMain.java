package sec10;

class Tv {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}
}

public class TvMain {

	public static void main(String[] args) {
		System.out.println(Tv.company);
		System.out.println(Tv.model);
		System.out.println(Tv.info);
	}

}
