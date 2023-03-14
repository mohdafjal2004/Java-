//Here we modify Array Elements
package arrays;

import java.util.Arrays;

public class ModificationOfArrays {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(nums));
		
		//direct modification by specifying the values of array elements
 		nums[1] = 786;
 		System.out.println("Direct modified of Array- " + Arrays.toString(nums));
 		
 		
 		//Calling a function
 		change(nums);
 		System.out.println("Array modification by calling a function- " +Arrays.toString(nums));
	}
 
	 //modification by creating a function and calling it
	static void change(int[] arr) {
		arr[0] = 99;
	}

}
