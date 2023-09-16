package sec11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx {
	public static void main(String[] args) throws Exception{
		// File 객체 생성
		File dir = new File("images");
		File file1 = new File("file1.txt");
		File file2 = new File("file2.txt");
		File file3 = new File("file3.txt");
		
		// 존재하지 않으면 디렉토리 또는 파일 생성
		if(dir.exists() == false) {dir.mkdirs();} // 폴더 생성
		if(file1.exists() == false) {file1.createNewFile();} // 파일 생성
		if(file2.exists() == false) {file2.createNewFile();}
		if(file3.exists() == false) {file3.createNewFile();}
		
		// 폴더 내용 출력
		File temp = new File("D:\\seonjin\\javaStudy\\javaStudy\\ThisIsJava");
		File[] contents = temp.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.printf("%-10s%-20s", "<DIR>", file.getName());
			} else {
				System.out.printf("%-10s%-20s", file.length(), file.getName());
			}
			System.out.println();
		}
	}
}
