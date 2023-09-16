package sec03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("test1.db");
			while(true) {
				int data = is.read(); // 1byte씩 읽기
				if(data == -1) break; // 더이상 읽을 수 없는 경우(끝난 경우) -1반환하기 때문
				System.out.println(data);
			}
			is.close(); // 입력 스트림을 닫고 사용 메모리 해제
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
