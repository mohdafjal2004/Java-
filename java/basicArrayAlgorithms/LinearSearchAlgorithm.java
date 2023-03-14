package basicArrayAlgorithms;

public class LinearSearchAlgorithm {

	public static void main(String[] args) {
		int[] arr = { 23, 45, 1, 2, 8, 19, -3, -16, -11, 28 };
		int target = 19;
       System.out.println(linearSearch(arr, target));
       System.out.println(linearSearch2(arr, target));
	}

	// 1. Search in the array : return the index if item found
	// otherwise if not found return -1
	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		// run a for-loop
		for (int index = 0; index < arr.length; index++) {
			// check for element at every index if it is target
			int element = arr[index];
			if (element == target) {
				return index;//return the index if item found
			}

		}
		// this line will execute if none of the return statements above have been executed
		// hence target not found
		return -1;
	}
	
	// 2. Search in the array : return the actual element which is target if item found
		// otherwise if not found return -1
		static boolean linearSearch2(int[] arr, int target) {
			if (arr.length == 0) {
				return false;
			}
			// run a for-loop
			for (int index = 0; index < arr.length; index++) {
				// check for element at every index if it is target
				int element = arr[index];
				if (element == target) {
					return true;//return the actual target element if item found
				}

			}
			// this line will execute if none of the return statements above have been executed
			// hence target not found
			return false;
		}

}
