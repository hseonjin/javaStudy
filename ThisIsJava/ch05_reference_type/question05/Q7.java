package question05;

public class Q7 {

	public static void main(String[] args) {
		// 최대값을 출력하는 코드 작성 (for문 사용)
		
		int[] array = {1,5,3,8,2};
		
		int maxNum = array[0]; // 배열 원소 하나를 설정하고 for문 돌며 비교하여 가장 큰 값 추출
		
		for(int i=0; i<array.length; i++) {
			if(array[i] > maxNum) maxNum = array[i];
		}
		System.out.println(maxNum);

	}

}
