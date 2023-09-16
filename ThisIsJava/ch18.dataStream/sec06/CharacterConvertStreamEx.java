package sec06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamEx {

	public static void main(String[] args) throws Exception{
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception {
		//FileOutputStream에 OutputStreamWriter 보조스트림 연결
		OutputStream os = new FileOutputStream("test.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		writer.write(str); // 보조스트림을 이용하여 문자 출력
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception {
		//InputStream에 InputStreamReader 보조스트림을 연결
		InputStream is = new FileInputStream("test.txt");
		Reader reader = new InputStreamReader(is, "UTF-8");
		char[] data = new char[100];
		int num = reader.read(data); // 보조스트림을 이용하여 문자 입력
		reader.close();
		String str = new String(data, 0, num); // 배열에서 읽은 문자 수만큼 반환
		return str;
	}
}
