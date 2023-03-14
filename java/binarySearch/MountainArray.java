package binarySearch;

public class MountainArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 4, 3, 2 };
		System.out.println(peakIndexInMountainArray(arr));
	}

	public static int peakIndexInMountainArray(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
//				it means we are in decreasing part of array
				// this may be the answer, but look at the LHS
				// this is why end != mid - 1;
				end = mid;
			} else {
				// we are in ascending part of array
				start = mid + 1;
				// Because we know that mid+1 element > mid element
			}
		}

		// At last, start == end and pointing to the largest number because of the 2
		// checks above

		// start and end are always trying find max element in the above 2 checks

		// hence when they are pointing to just one element,that is the max one
		// because that is what the checks say

		// more elaboration at every point of time for start and end, they have the best
		// possible answer till that time

		// And if we are saying that only one item is remaining, hence cuz of above line
		// that is the best possible answer

		return start; // or return end becoz start == end
	}
}
