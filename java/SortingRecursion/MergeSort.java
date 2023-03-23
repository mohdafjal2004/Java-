package SortingRecursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        arr = mergeStort(arr);// Updating the original array
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeStort(int[] arr) {

        // base-condition
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeStort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeStort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {

        int[] mix = new int[first.length + second.length];
        // Our resultant array after sorting,moving elements from both sub-array into
        // this mix array

        int i = 0;// pointer of 1st array
        int j = 0;// pointer of 2nd array
        int k = 0;// pointer of new array declared as mix

        // Now we check and compare the elements of the arrays using pointer till array
        // out of bound
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];// Putting the smaller elements in the mixed array
                // Move to next element of same araay if found smaller
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;

        }
        // It may be possible that 1 of the arrays is not complete
        // Copy the remaning elements in the end
        while (i < first.length) {// Means first[] has remaining elements
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {// Means second[] has remaining elements
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;

    }

}
