package SortingRecursion;

import java.util.Arrays;

public class BubblSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int row, int col) {

        // base-condition
        if (row == 0) {
            return;
        }

        if (col < row) {
            if (arr[col] < arr[col + 1]) {
                // swap
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;

            }
            bubbleSort(arr, row, col + 1);

            // Moving to next line
        } else {
            bubbleSort(arr, row - 1, 0);// Start printing stars

        }
    }

}
