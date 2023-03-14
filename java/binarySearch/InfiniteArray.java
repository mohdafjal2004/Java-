package binarySearch;

public class InfiniteArray {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 7, 9, 10, 100, 130, 160, 170 };
		int target = 10;
		System.out.println(ans(arr, target));
	}

	static int ans(int[] arr, int target) {
		// first find the range
		//// start with the box of size 2
		int start = 0;
		int end = 1;

		// condition for the target to lie in the range
		while (target > arr[end]) {
			int NewStart = end + 1;// our new start
			// double the box value
			// formula for end after doubling
			// end = previous end + sizeOfBox * 2;

			end = end + (end - start + 1) * 2;
			start = NewStart;

		}
		return binarySearch(arr, target, start, end);
	}

	static int binarySearch(int[] arr, int target, int start, int end) {

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

		return -1; // in case of simple BSA when we don't get our desired element in the array

	}

}
