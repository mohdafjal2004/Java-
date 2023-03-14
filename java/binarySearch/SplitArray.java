package binarySearch;

public class SplitArray {

	public static void main(String[] args) {

	}

	public int AplitArray(int[] nums, int m) {
		int start = 0;
		int end = 0;

		for (int i = 0; i < nums.length; i++) {
			start = Math.max(start, nums[i]); // in the end of the loop this will contain the max item in the array
			end += nums[i];
		}

		// binary search
		while (start < end) {
			// try for the middle as potential answer
			int mid = start + (end - start) / 2;

			// Calculate how many pieces we can divide this in with this max sum
			int sum = 0;
			int subarray = 0;

			for (int num : nums) {
				if (sum + num > mid) {
					// you cannot add this in this subarray, make new one
					// say you add this num in new subarray,then sum = num;
					sum = num;
					subarray++;

				} else {
					start += num;
				}
			}

			if (subarray > m) {
				start += mid;
			} else {
				end = mid;
			}

		}
		return end; // here start == end

	}

}
