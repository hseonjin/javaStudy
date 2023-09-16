package sec04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadEx {

	public static void main(String[] args) {
		try {
			Reader reader = null;

			// 1문자씩 읽기
			reader = new FileReader("test.txt");
			while (true) {
				int data = reader.read(); // 문자 읽음
				if (data == -1)
					break; // 파일을 다 읽으면 while문 종료
				System.out.println((char) data); // 읽은 문자 출력
			}
			reader.close();
			System.out.println();

			// 문자 배열로 읽기
			reader = new FileReader("test.txt");
			char[] data = new char[100]; // 문자를 저장할 배열 생성
			while (true) {
				int num = reader.read(data);
				if (num == -1) break;
				for (int i = 0; i < num; i++) { // 읽은 문자 수만큼 출력
					System.out.println(data[i]);
				}
			}
			reader.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
