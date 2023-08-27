package question06;

import java.util.Scanner;

class Account2 {
	// 필드 생성
	String number;
	String name;
	int balance;
	
	// getter, setter
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 생성자
	Account2() {}
	Account2(String number, String name, int balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	
	// 메소드
	String info() {
		return String.format("%s\t%s\t%d", number, name, balance);
	}
	
	void deposit(int money) {
		balance += money;
	}
	
	void withdraw(int money) {
		if (balance >= money) 
			balance -= money;
	}
	
}

// bank
public class Q20 {
	
	Account2[] accArr = new Account2[100];
	Scanner sc = new Scanner(System.in);
	int accCnt;
	Account2 acc;
	
	// 메뉴 선택
	int menu() {
		int sel;
		System.out.println("-----------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("-----------------------------------------");
		System.out.println("선택 > ");
		return Integer.parseInt(sc.nextLine());
	}
	
	// 계좌 생성
	void makeAccount2() {
		System.out.println("[계좌생성]");
		System.out.println("계좌번호: ");
		String number = sc.nextLine();
		System.out.println("계좌주: ");
		String name = sc.nextLine();
		System.out.println("초기입금액: ");
		int balance = Integer.parseInt(sc.nextLine());
		System.out.println("계좌가 생성되었습니다.");
		accArr[accCnt++] = new Account2(number, name, balance);
		System.out.println("성공");
	}
	
	// 계좌 목록
	void accList() {
		System.out.println("[계좌목록]");
		for(int i=0; i<accCnt; i++) {
			System.out.println(accArr[i].info());
		}
	}
	
	// 계좌번호 조회
	Account2 searchByNumber(String number) {
		for(int i=0; i<accCnt; i++ ) {
			if(accArr[i].getNumber().equals(number)) {
				return accArr[i];
			}
		}
		return null;
	}
	
	// 예금
	void deposit() {
		System.out.println("[예금]");
		System.out.println("[계좌번호]");
		String number = sc.nextLine();
		Account2 acc = searchByNumber(number);
		if(acc==null) {System.out.println("계좌번호 오류"); return;}
		System.out.println("[예금액]");
		int money = Integer.parseInt(sc.nextLine());
		acc.deposit(money);
	}
	
	// 출금
	void withdraw() {
		System.out.println("[출금]");
		System.out.println("[계좌번호]");
		String number = sc.nextLine();
		Account2 acc = searchByNumber(number);
		if(acc==null) {System.out.println("계좌번호 오류"); return;}
		System.out.println("[출금액]");
		int money = Integer.parseInt(sc.nextLine());
		acc.withdraw(money);
	}
	
	

	public static void main(String[] args) {

		Q20 bank = new Q20();
		int sel=0;
		
		while(true) {
			
			sel = bank.menu();
			
			if(sel == 5) break;
			switch(sel) {
			case 1: bank.makeAccount2(); break;
			case 2: bank.accList(); break;
			case 3: bank.deposit(); break;
			case 4: bank.withdraw(); break;
			}
		}
		
	}

}
