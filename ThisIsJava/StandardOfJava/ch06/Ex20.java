package ch06;

public class Ex20 {

	public static int[] shuffle(int[] arr) {
		
		// 복제
		int[] mixarr = new int[arr.length];
		System.arraycopy(arr, 0, mixarr, 0, arr.length);
		
		for(int i=0; i<1000; i++) {
			int idx1 = (int)(Math.random() * arr.length);
			int idx2 = (int)(Math.random() * arr.length);
			int tmp = mixarr[idx1];
			mixarr[idx1] = mixarr[idx2];
			mixarr[idx2] = tmp;
		}
		return mixarr;
	}

	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));

		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
