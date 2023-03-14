
/*This question is for single duplicate in the array*/
package sortingQuestions;

public class DuplicateNumber {

	public static void main(String[] args) {
		int[] nums = { 3, 1, 3, 4, 2 };
		int ans = FindDuplicateNumber(nums);
		System.out.println(ans);

	}

	static int FindDuplicateNumber(int[] arr) {
		int i = 0;
		// here sorting will occur
		while (i < arr.length) {

			// Approach-1 of finding the duplicate element
			if (arr[i] != i + 1) {// if any number is at wrong index
				int correctindex = arr[i] - 1;
				if (arr[i] != arr[correctindex]) {
					swap(arr, i, correctindex);
				} else {
					return arr[i];//here it returns dupicate, if any
				}
			} else {// if any number is at correct index move to next element
				i++;
			}

		}
		// if not duplicates
		return -1;

		// Approach2 : first sort using cyclic sort and then
		// Duplicate element is present at the last index of array
		// return arr[arr.length - 1];
	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}

}
