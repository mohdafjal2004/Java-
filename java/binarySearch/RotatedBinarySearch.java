package binarySearch;

public class RotatedBinarySearch {

	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(findPivot(nums));
	}

	static int search(int[] nums, int target) {
		int pivot = findPivot(nums);

		// if we don't have a pivot, it means that array is not rotated
		if (pivot == -1) {
			// just do normal BSA
			return binarySearch(nums, target, 0, nums.length - 1);
		}

		// if pivot is found, we have 2 ascending sorted arrays
		// 3-cases
		if (nums[pivot] == target) {
			return pivot;
		}

		if (target >= nums[0]) {
			return binarySearch(nums, target, 0, pivot - 1);
		}

		return binarySearch(nums, target, pivot + 1, nums.length - 1);
	}

	static int binarySearch(int[] arr, int target, int start, int end) {

		while (start <= end) {
			// find the middle element
//			int mid = (start + end)/2; 
			// might be possible that (start + end) exceeds the range of integer in java

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

	// this will not work for duplicate elements
	static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {

			// first find middle element
			int mid = start + (end - start) / 2;
			// 4 cases here to find pivot
			// case1
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;

			}
			// case2
			if (start < mid && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			// case3
			if (arr[mid] <= arr[start]) {
				// all elements after the mid elements are smaller then the start
				// ignore all the elements after mid
				end = mid - 1;
			}
			// case4
			else { // if all elements after mid are bigger then start elements
					// ignore all elements before mid
				start = mid + 1;
			}
		}
		return -1;
	}

	// this will not work duplicate elements
	static int findPivotWithDuplicate(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {

			// first find middle element
			int mid = start + (end - start) / 2;
			// 4 cases here to find pivot
			// case1
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;

			}
			// case2
			if (start < mid && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			// if elements at start,mid,end are equal then just skip the duplicates
			if (arr[mid] == arr[start] && arr[end] == arr[start]) {
				// skip the duplicates

				// NOTE: What if these elements at start and end were the pivot ? 😲

				// first check if start is pivot
				if (arr[start] > arr[start + 1]) {
					return start;
				}
				start++;

				// Then check whether end is pivot
				if (arr[end] < arr[end - 1]) {
					return end - 1;
				}
				end--;

			}

			// left side is sorted , so pivot should be in right
			else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[mid]) {
				start = mid + 1;
			} else {
			}
		}
		return -1;
	}

}
