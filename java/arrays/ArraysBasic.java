package arrays;

import java.util.Scanner;

public class ArraysBasic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// syntax
		// data_type[] variable_name = new datatype[size];

		// ex: store 5 roll numbers
		int[] rollNo = new int[5];

		// breaking down the synatx
		// int[] rollNo = declaration of array,rollNo is getting defined in the stack

		// rollNo = new int[5]; = initialisation: actually here object is being created
		// in the memory(heap)

		

		
		
		// directly
		int[] rollNo2 = { 23, 34, 56, 67, 78 };

		System.out.println(rollNo[1]);

		String[] arr2 = new String[4];
		System.out.println(arr2[3]);
	}

}
