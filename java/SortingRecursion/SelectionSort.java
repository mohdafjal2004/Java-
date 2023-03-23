package SortingRecursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        Sort(arr, arr.length , 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr, int row, int col, int max) {

        // base-condition
        if (row == 0) {
            return;
        }

        if (col < row) {
            if (arr[col] > arr[max]) {
                Sort(arr, row, col + 1, col);

            } else {
                Sort(arr, row, col + 1, max);
            }

            // After evaluating the entire line i.e finding the max element
            // swap the max with new max

        } else {
            int temp = arr[max];
            arr[max] = arr[row - 1];// arr[row-1] is the last element of the row
            arr[row - 1] = temp;
            Sort(arr, row - 1, 0, 0);
            // Now after this we again assume that element at index0 of next element is the
            // max. element and goes for the thing

        }
    }

}
