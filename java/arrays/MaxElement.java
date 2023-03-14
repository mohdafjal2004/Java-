package arrays;

public class MaxElement {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 23, 9, 10 };
		System.out.println(max(arr));
		System.out.println(maxRange(arr, 1, 3));// max in range
	}

	// imagine that array is not empty
	static int max(int[] arr) {
		int maxVal = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;
	}

	// max element in any range
	static int maxRange(int[] arr, int start, int end) {
		// edge-cases
		if (arr.length == 0) {
			return -1; 
		}
		int maxVal = arr[start];
		for (int i = start; i <= end; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;
	}
}
