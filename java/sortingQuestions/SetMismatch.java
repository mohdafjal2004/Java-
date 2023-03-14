package sortingQuestions;

import java.util.Arrays;

public class SetMismatch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 4 };
		int[] ans = findErrorNums(arr);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] findErrorNums(int[] arr) {
		int i = 0;

		while (i < arr.length) {

			int correctindex = arr[i] - 1;

			if (arr[i] != arr[correctindex]) {
				// arr[i] < arr.length means ignoring the N(arr.length)
				swap(arr, i, correctindex);
			} else {
				i++;
			}
		}

		// यहाँ searching of missing number होगी

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1) {
				return new int[] { arr[index], index + 1 };
			}

		}
		return new int[] { -1, -1 };
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}

}
