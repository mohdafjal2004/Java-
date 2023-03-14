package sortingQuestions;

public class FirstMissingPositive {

	public static void main(String[] args) {
		int[] arr = { 3,4,-1,1 };
		System.out.println(firstMissingPositive(arr));
	}

	static int firstMissingPositive(int[] arr) {

		int i = 0;

		while (i < arr.length) {

			int correctindex = arr[i] - 1;
			if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctindex]) {
				// arr[i] < arr.length means ignoring the N(arr.length)
				swap(arr, i, correctindex);
			} else {
				i++;
			}
		}

		// यहाँ searching of missing number होगी
		// search for the first missing number using index number
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1) {
				return index + 1;
			}

		}

		// case2: When N is not present,N is the missing number
		return arr.length + 1;

	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}

}
