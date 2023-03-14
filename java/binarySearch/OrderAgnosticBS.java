package binarySearch;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		int[] arr = { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
		int target = 22;
		
    int ans = OrderABS(arr,target);
	System.out.println(ans);
}

	 static int OrderABS(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		// find whether the array is ascending or descending
		boolean isAscending;
		if (arr[start] < arr[end]) {
			isAscending = true;

		} else {
			isAscending = false;

		}

		while (start <= end) {
			// find the middle element
//			int mid = (start + end)/2; 
			// might be possible that (start + end) exceeds the range of integer in java
			int mid = start + (end - start) / 2;

			// Common situation that is mid == target in both ascending or descending
			if (arr[mid] == target) {
				return mid;
			}

			if (isAscending) {
				if (target < arr[mid]) {
					end = mid - 1;

				} else if (target > arr[mid]) {
					start = mid + 1;

				} else {
					// ans found
					return mid;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else if (target < arr[mid]) {
					start = mid + 1;
				} else {
					return mid;
				}
			}

		}
		return -1;

	}

}
