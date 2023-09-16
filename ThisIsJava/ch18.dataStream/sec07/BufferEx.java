package sec07;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferEx {

	public static void main(String[] args) throws Exception{
		// FileReader에 BufferedReader 보조스트림 연결
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		
		int lineNo = 1;
		while(true) {
			String str = br.readLine(); // 한 행을 읽음
			
			if(str == null) break; // 더이상 읽을 내용이 없으면 while문 종료
			System.out.println(lineNo + "\t" + str);
			lineNo++;
		}
		br.close();
	}
}
