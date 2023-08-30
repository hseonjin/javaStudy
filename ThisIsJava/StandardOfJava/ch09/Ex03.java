package ch09;

public class Ex03 {
	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		/*
		 * (1) 알맞은 코드를 넣어 완성하시오.
		 */
		int idx = fullPath.lastIndexOf("\\");
		path = fullPath.substring(0, idx);
		fileName = fullPath.substring(idx+1);
		
		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);
	}
}

//실행결과
//fullPath:c:\jdk1.5\work\PathSeparateTest.java
//path:c:\jdk1.5\work
//fileName:PathSeparateTest.java