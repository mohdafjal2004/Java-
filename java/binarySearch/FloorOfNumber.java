package binarySearch;

public class FloorOfNumber {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 15;
		int ans = floor(arr, target);
		System.out.println(ans);

	}

	// return the index that is the biggest number smaller
	// then or equal to target
	static int floor(int[] arr, int target) {

		// but what if the target is the smaller than smallest number in the array
		if (target < arr[0]) {
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
		return end; // For finding floor value we return end , that is the biggest number smaller
					// then or equal to target

	}
}
