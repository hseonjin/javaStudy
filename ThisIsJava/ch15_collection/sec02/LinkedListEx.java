package sec02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();

		List<String> list2 = new LinkedList<>();

		// 시간 시작과 끝 시간을 지정할 변수 선언
		long startTime;
		long endTime;

		// ArrayList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", (endTime - startTime));

		// LinkedList 컬렉션에 저장하는 시간 측정
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ", (endTime - startTime));
	}
}
