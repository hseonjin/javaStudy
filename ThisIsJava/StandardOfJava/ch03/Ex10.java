package ch03;

public class Ex10 {

	public static void main(String[] args) {
		// 소문자를 대문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다. 
		// 문자코드는 소문자가 대문자보다 32만큼 더 크다. 
		char ch = 'A';
		char lowerCase = (ch >= 'A' && ch <= 'Z') ? ((char)(ch+32)) : ch;
		System.out.println("upperCase:"+ch);
		System.out.println("lowerCase:"+lowerCase);
	}

}
