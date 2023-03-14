package sortingQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNumbers {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> ans = findDisapperedNumbers(arr);
		System.out.println(ans);
	}

	public static List<Integer> findDisapperedNumbers(int[] nums) {
		int i = 0;

		while (i < nums.length) {

			int correctindex = nums[i] - 1;
			if (nums[i] != nums[correctindex]) {
				swap(nums, i, correctindex);
			} else {
				i++;
			}
		}

		// just find missing number after sorting
		// ArrayList used here coz list of missing numbers can be variable
		// and the array of variable length is called ArrayList
		List<Integer> ans = new ArrayList<>();
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index + 1) {
				ans.add(index + 1);
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
