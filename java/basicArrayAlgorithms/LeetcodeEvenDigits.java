package basicArrayAlgorithms;

public class LeetcodeEvenDigits {

	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896 };
		System.out.println(findEvenNoOfDigits(nums));
		System.out.println(digits(-973687983));
	}

	static int findEvenNoOfDigits(int[] nums) {

		int count = 0;
		for (int num : nums) {
			if (even(num)) {
				count++;
			}
		}
		return count;
	}

	// function to check whether a number contains even digits or not
	static boolean even(int num) {
		int numOfDigits = digits(num);
//		if (numOfDigits % 2 == 0) {
//			return true;
//		}
//		return false;

		return numOfDigits % 2 == 0; // shortcut of above commented code
	}

	// count number of digits in a number
	static int digits(int num) {

		// To find the number of digits in a negative number,
		// we convert it into positive number
		if (num < 0) {
			num *= -1;
		}
		if (num == 0) {
			return 1;
		}

		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}
	
	static int digits2(int num) {

		// To find the number of digits in a negative number,
		// we convert it into positive number
		if (num < 0) {
			num *= -1;
		}
		if (num == 0) {
			return 1;
		}

		return (int)Math.log10(num) + 1 ; 
		
	}

}
