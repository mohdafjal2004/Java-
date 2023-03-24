package SortingRecursion;

import java.util.Arrays;

public class MergedInPlace {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static void mergeSortInPlace(int[] arr, int start, int end) {

        // base-condition
        if (end - start == 1) {
            return;
        }   

        int mid = arr.length / 2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end) {

        int[] mix = new int[end - start];
        // Our resultant array after sorting

        int i = start;// pointer of 1st array
        int j = mid;// pointer of 2nd array
        int k = 0;// pointer of new array declared as mix

        // Now we check and compare the elements of the arrays using pointer till array
        // out of bound
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];// Putting the smaller elements in the mixed array
                // Move to next element of same araay if found smaller
                i++;

            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;

        }
        // It may be possible that 1 of the arrays is not complete
        // Copy the remaning elements in the end
        while (i < mid) {// Means first[] has remaining elements
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {// Means second[] has remaining elements
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; i++) {
            arr[start + l] = mix[l];
        }

    }
}
