package sortingQuestions;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 4, 0, 2, 1 };
		System.out.println(missingnum(arr));
	}

	static int missingnum(int[] arr) {

		int i = 0;
		// case1: When N is present in the array, ignore the N
		while (i < arr.length) {

			int correctindex = arr[i];// since in the sorted array,[0,N]
			// index value start from 0 and elements also start from 0

			// पहले sorting करेंगे, फिर searching करेंगे
			if (arr[i] < arr.length && arr[i] != arr[correctindex]) {
				// arr[i] < arr.length means ignoring the N(arr.length)
				swap(arr, i, correctindex); 
			} else {
				i++;
			}
		}

		// यहाँ searching of missing number होगी
		// search for the first missing number using index number
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index) {
				return index;
			}

		}

		// case2: When N is not present,N is the missing number
		return arr.length;

	}

	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}

}
