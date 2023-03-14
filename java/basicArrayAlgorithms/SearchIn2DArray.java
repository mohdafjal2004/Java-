package basicArrayAlgorithms;

import java.util.Arrays;


public class SearchIn2DArray {

	public static void main(String[] args) {
		int[][] arr = { { 24, 4, 1 },
				{ 18, 12, 3, 9 },
				{ 78, 99, 34, 56 },
				{ 18, 12 } };

		int target = 99;
		// when we just want to search the target(i.e 34)
		//System.out.println(search(arr, target));

//when we want to know the location(index no.) of our target in 2d array
		int[] ans = search(arr, target);// format of return value {row,col}
		System.out.println(Arrays.toString(ans));
	}

	static int[] search(int[][] arr, int target) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				int RowColValue = arr[row][col];
				if (RowColValue == target) {
					return new int[] { row, col };
				}
			}

		}
		return new int[] { -1, -1 };

	}
}
