package sec08;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamEx {

	public static void main(String[] args) throws Exception{
		// DateOutputStream 생성
		FileOutputStream fos = new FileOutputStream("test.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		// 기본 타입 출력
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
	
		dos.writeUTF("차길동");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush();
		dos.close();
		fos.close();
		
		// DataInputStream 생성
		FileInputStream fis = new FileInputStream("test.db");
		DataInputStream dis = new DataInputStream(fis);
		
		// 기본 타입 출력
		for(int i=0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + ":" + score + ":" + order);
		}
		dis.close();
		fis.close();
	}
}
