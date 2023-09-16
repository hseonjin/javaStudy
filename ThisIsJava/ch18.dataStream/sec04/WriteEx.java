package sec04;

import java.io.FileWriter;
import java.io.Writer;

public class WriteEx {

	public static void main(String[] args) {
		try {
			// 문자 기반 출력 스트림 생성
			Writer writer = new FileWriter("test.txt");
			
			// 1. 1문자씩 출력
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			
			// 2. char 배열 출력
			char[] arr = {'C','D','E'};
			writer.write(arr);
			
			// 3. 문자열 출력
			writer.write("FGH");
			
			// 버퍼 잔류 문자 출력, 비움
			writer.flush();
			// 출력 스트림 닫고 메모리 해제
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
// 파일 생성 결과 : ABCDEFGH