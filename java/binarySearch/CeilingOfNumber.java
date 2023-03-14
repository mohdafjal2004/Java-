package binarySearch;

public class CeilingOfNumber {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 17;
		int ans = Ceiling(arr, target);
		System.out.println(ans);

	}

	// return the index of smallest number that is greater than or equal to target
	static int Ceiling(int[] arr, int target) {

		// But what if the target is greater than the greatest number in the array
		if (target < arr[arr.length - 1]) {
			return -1;
		}

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;

			} else if (target > arr[mid]) {
				start = mid + 1;

			} else {
				// ans found
				return mid;
			}
		}

//		return -1; //in case of simple BSA when we don't get our desired element in the array
		return start; // For finding ceiling value we return start , which is smallest number greater
						// than or equal to target

	}
}
