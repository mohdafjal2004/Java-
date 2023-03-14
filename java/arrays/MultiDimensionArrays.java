package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// syntax
		// int[][] arr = new int[3][];
		// no need to specify the number of columns
		// because they can variable for each row

		// syntax for directly creating 2d array
//		int[][] arr = { 
//				{ 1, 2, 3 }, // 0th index = 1st row
//				{ 4, 5, 6 }, // 1st index = 2nd row
//				{ 7, 8, 9, 0 } 
//		// 2nd index -> arr2D[2] = {6,7,8,9} = 3rd row
//		};

		int[][] arr = new int[3][3];
		System.out.println(arr.length); // no. of rows

		// input
		for (int row = 0; row < arr.length; row++) {
			// for each column in every row
			for (int col = 0; col < arr[row].length; col++) 
			  {
				arr[row][col] = sc.nextInt();
			}
		}
		
		//output
		
				for (int row = 0; row < arr.length; row++) {
					// for each column in every row
					for (int col = 0; col < arr[row].length; col++) 
					  {
						System.out.print(arr[row][col]+ " ");
					}
					
//					We can even use Arrays.toString which internally  also uses for-loop
					//for printing column
//					System.out.println(Arrays.toString(arr[row]));
					
					
					//Using enhanced for-loop(for-each loop)
//					for(int[] a: arr) {
//						System.out.println(Arrays.toString(a));
//					}
					System.out.println();
				}
	}
}
