package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		//array of primitives
		int[] arr = new int[5];
		arr[0] = 23;
		arr[1] = 45;
		arr[2] = 67;
		arr[3] = 89;
		arr[4] = 11;
		//internally stored as [23,45,67,89,11]
		System.out.println(arr[3]);
		System.out.print(arr.length);
		
		//Input using for-loop
		for(int i= 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

        //Output using toString() method
		System.out.print(Arrays.toString(arr));
		
		//output using for-loop
//		for(int i = 0; i < arr.length ; i++) {
//			System.out.print(arr[i]+ " ");
//		}
//		
//		for(int num : arr) {//for every element in the array, print the element
//			System.out.print(num + " ");
//		}
		
		//System.out.println(arr[8]);//index out of bound error
	}

}
