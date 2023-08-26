package question06;

class Account {
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;

	Account() {
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int money) {
		if (money < Account.MIN_BALANCE || money > Account.MAX_BALANCE) {
			return;
		}
		this.balance = money;
	}
}

public class Q19 {

	public static void main(String[] args) {
		Account account = new Account();

		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());

		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());

		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance());

		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance());
	}

}
