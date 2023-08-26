package ch05;

public class Ex10 {

	public static void main(String[] args) {
		// 암호화
		char[] abcCode = 
			 { '`','~','!','@','#','$','%','^','&','*',
			 '(',')','-','_','+','=','|','[',']','{',
			 '}',';',':',',','.','/'};
		
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		String src = "abc123";
		String result = "";
		
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if(ch>='a' && ch<= 'z') {
				result += abcCode[ch - 'a'];
			} else {
				result += numCode[ch - '0'];
			}
		}
		System.out.println("src:" + src);
		System.out.println("result:" + result);

	}

}
