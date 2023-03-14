package basicArrayAlgorithms;

import java.util.Arrays;

public class MaxIn2DArray {

	public static void main(String[] args) {
	
			int[][] arr = { { 24, 4, 1 },
					{ 18, 12, 3, 9 },
					{ 78, 99, 34, 56 },
					{ 18, 12 } };

			
			
			
			System.out.println(max(arr));
		}

		static int max(int[][] arr) {
			int maxVal = arr[0][0];
			for (int row = 0; row < arr.length; row++) {
				for (int col = 1; col < arr[row].length; col++) {
					int RowColValue = arr[row][col];
					if (RowColValue > maxVal) {
						maxVal = RowColValue;
					}
				}
				

			}
			return maxVal;

		}
	}


