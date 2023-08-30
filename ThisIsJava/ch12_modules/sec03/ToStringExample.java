package sec03;

class SmartP {
	private String company;
	private String os;

	public SmartP(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
		return company + ", " + os;
	}
}

public class ToStringExample {
	public static void main(String[] args) {
		SmartP myPhone = new SmartP("삼성전자", "안드로이드");

		String strObj = myPhone.toString();
		System.out.println(strObj);

		System.out.println(myPhone);
	}
}