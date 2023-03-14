package binarySearch;

import java.util.Arrays;

public class SortedMatrix {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.toString(search(arr, 9)));
	}

	// searching in entire matrix
	static int[] search(int[][] matrix, int target) {
		int rows = matrix.length;// size of matrix is usually determined by number of row,
//		may be the matrix is of 1 dimension so number of rows are preferred

		int cols = matrix[0].length; // be cautious, matrix may be empty
		// matrix[0].length is used for searching length of first row of matrix

		if (rows == 1) {// edge-case
			return binarySearch(matrix, 0, 0, 1, target);
		}

		// perform the BSA on mid-column to eleminate the number of rows

		int rowStart = 0;
		int rowEnd = rows - 1;
		int middleColumn = cols / 2;

		// run the loop till 2 rows are remaining
		while (rowStart < (rowEnd - 1)) {// while this is true it will have more than 2 rows which we are trying to
											// eliminate
			int midOfColumn = rowStart - (rowStart - rowEnd) / 2;
			if (matrix[midOfColumn][middleColumn] == target) {
				return new int[] { midOfColumn, middleColumn };
			}

			if (matrix[midOfColumn][middleColumn] < target) {// ignore the above rows
				rowStart = midOfColumn;
			} else {
				rowEnd = midOfColumn;
			}
		}

		// Now only 2 rows are remaining
		// check whether the target is in column of 2 rows
		if (matrix[rowStart][middleColumn] == target) {
			return new int[] { rowStart, middleColumn };
		}

		if (matrix[rowStart + 1][middleColumn] == target) {// rowStart + 1 means 2nd row
			return new int[] { rowStart + 1, middleColumn };
		}

		// search in 1st half of 1st row
		if (target <= matrix[rowStart][middleColumn - 1]) {
			return binarySearch(matrix, rowStart, 0, middleColumn - 1, target);
		}
		// search in 2nd half of 1st row
		if (target >= matrix[rowStart][middleColumn + 1] && target <= matrix[rowStart][cols - 1]) {
			return binarySearch(matrix, rowStart, middleColumn + 1, cols - 1, target);
		}

		// search in 3rd half of 2nd row
		if (target <= matrix[rowStart + 1][middleColumn - 1]) {
			return binarySearch(matrix, rowStart + 1, 0, middleColumn - 1, target);
		}
		// search in 4th half of 2nd row
		if (target >= matrix[rowStart + 1][middleColumn + 1]) {
			return binarySearch(matrix, rowStart + 1, middleColumn + 1, cols - 1, target);
		}
		return new int[] { -1, -1 };

	}

	// use Simple Binary Search for seaching in each row(which remained after
	// eliminating other rows which are less than or equal to mid)
	// using column start and column end
	static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
		while (colStart <= colEnd) {
			int mid = colStart + (colStart - colEnd) / 2;

			if (matrix[row][mid] == target) {
				return new int[] { row, mid };
			}
			if (matrix[row][mid] < target) {
				colStart = mid + 1;
			} else {
				colEnd = mid - 1;
			}
		}
		return new int[] { -1, -1 };
	}

}
