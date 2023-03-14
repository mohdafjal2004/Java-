package arrays;

import java.util.Arrays;
 
public class Swap {

	public static void main(String[] args) {
		//initialize
		int[] arr = {1,4,5,6,7};
		swap(arr,1,3);
    System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
