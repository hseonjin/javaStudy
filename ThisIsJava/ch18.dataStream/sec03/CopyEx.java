package sec03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyEx {
	public static void main(String[] args) throws Exception {
		String originalFileName = "k.jpg";
		String targetFileName = "k_copy.jpg";

		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);

		byte[] data = new byte[1024]; // 읽은 파일을 저장할 배열
		while (true) {
			int num = is.read(data);
			if (num == -1)break;
			os.write(data, 0, num); // 읽은 바이트 수만큼 출력
		}
		os.flush(); // 내부 버퍼 잔류 바이트 출력 후 비움
		os.close();
		is.close();

		System.out.println("복사 성공");
	}
}
