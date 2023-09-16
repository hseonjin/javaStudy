package sec02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx2 {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("test2.db");
            byte[] array = {10,20,30}; 
            os.write(array); // 배열의 모든 바이트 출력
			
			os.flush(); // 내부 버퍼에 잔류하는 바이트를 출력 후 비움
			os.close(); // 출력 스트림을 닫고 사용 메모리 해제
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
