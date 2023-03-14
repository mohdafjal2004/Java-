package sortingQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {

	public static void main(String[] args) {

		int[] arr = { 4,3,2,7,8,2,3,1 };
		List<Integer> ans = findDuplicatesArray(arr);
		System.out.println(ans);

	}

	public static List<Integer> findDuplicatesArray(int[] arr) {

		int i = 0;

		while (i < arr.length) {

			int correctindex = arr[i] - 1;
			if (arr[i] != arr[correctindex]) {
				swap(arr, i, correctindex);
			} else {
				i++;
			}
		}

		List<Integer> ans = new ArrayList<>();
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1) {
				ans.add(arr[index]);
			}

		}

		return ans;

	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}

}
