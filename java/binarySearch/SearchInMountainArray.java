package binarySearch;

public class SearchInMountainArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
		int target = 3;
		System.out.println(search(arr, target));
	}

	static int search(int[] arr, int target) {
		int peak = peakIndexInMountainArray(arr);

		// After finding peak we first search in first half of array
		int firstPart = OrderABS(arr, target, 0, peak);
		if (firstPart != -1) {
			return firstPart;
		}
		// now we search in second half of array
		int secondPart = OrderABS(arr, target, peak + 1, arr[arr.length - 1]);
		
		return secondPart;

	}

//first we find peak, then we search index of target value in ascending and descending separately
	public static int peakIndexInMountainArray(int[] arr) {
//explaination of this in mountainArray class in another file
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
//				
				end = mid;
			} else {
				// we are in ascending part of array
				start = mid + 1;
				// Because we know that mid+1 element > mid element
			}
		}

		return start; // or return end becoz start == end
	}

	// After finding peak , we perform binary search separately in both ascending
	// and descending
	static int OrderABS(int[] arr, int target, int start, int end) {

		// find whether the array is ascending or descending
		boolean isAscending;
		if (arr[start] < arr[end]) {
			isAscending = true;

		} else {
			isAscending = false;

		}

		while (start <= end) {
			// find the middle element
//				int mid = (start + end)/2; 
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
