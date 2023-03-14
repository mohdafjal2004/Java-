package sorting;

import java.util.Arrays;

public class CyclicSortAlgo {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 3, 4 };
		cyclicsort(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void cyclicsort(int[] arr) {
		int i = 0;

		while (i < arr.length) {
			// correctindex = arr[i] - 1 for sorted array, correctindex should be the correct index
			// of the element we are standing at rightnow, using i as pointer

			int correctindex = arr[i] - 1;
			if (arr[i] != arr[correctindex]) {
				swap(arr, i, correctindex);
			} else {
				i++;
			}
		}

	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}

}
