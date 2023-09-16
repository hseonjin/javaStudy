package sec02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("test1.db");
			byte a= 10, b=20, c=30;
			os.write(a); // 1byte씩 출력
			os.write(b);
			os.write(c);
			
			os.flush(); // 내부 버퍼에 잔류하는 바이트를 출력 후 비움
			os.close(); // 출력 스트림을 닫고 사용 메모리 해제
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
