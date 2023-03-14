package binarySearch;

import java.util.Arrays;

public class FirstnLastPosition {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 7, 7, 7, 8, 8, 10 };
		int target = 7;
		int[] answer = searchRange(arr, target);
		System.out.println(Arrays.toString(answer));
	}

	public static int[] searchRange(int[] nums, int target) {

		int[] ans = { -1, -1 };

		// check for first occurence of target first
		ans[0] = search(nums, target, true);

		// then check for last occurence of target
		ans[1] = search(nums, target, false);

		return ans;
	}

	// This function just returns the index value of target
	static int search(int[] nums, int target, boolean findStartIndex) {

		int ans = -1;
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {

			// find the middle element
			int mid = start + (end - start) / 2;

			if (target < nums[mid]) {
				end = mid - 1;

			} else if (target > nums[mid]) {
				start = mid + 1;

			} else {
				// here our target is equal to mid value
				// thats why our while loop operate here

				ans = mid;// index=3 <= potential ans at mid found
				// so it may be possible that our first and last occurence
				// lies at LHS & RHS of this mid respectively

				if (findStartIndex) {// for first occurence
					end = mid - 1;
				} else {
					start = mid + 1;// for last occurence
				}
			}
		}
		return ans;
	}
}
