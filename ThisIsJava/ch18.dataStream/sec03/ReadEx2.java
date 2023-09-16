package sec03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx2 {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("test2.db");
			
            byte[] data = new byte[100];
            while(true) {
            	int num = is.read(data);
                if(num == -1) break; // 파일 끝에 도달한 경우
                for(int i=0; i<num; i++) {
                	System.out.println(data[i]); // 읽은 데이터 출력
                }
            }
			is.close(); // 입력 스트림을 닫고 사용 메모리 해제
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
