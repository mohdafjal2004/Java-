package SortingRecursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] nums, int low, int hi) {
        // base-condition
        if (low >= hi) {
            return;
        }

        int start = low;
        int end = hi;
        int mid = start + (end - start) / 2;

        // Taking mid as pivot
        int pivot = nums[mid];

        // Also a reason why if it is already sorted it will not swap
        while (start <= end) {
            while (nums[start] < pivot) {
                start++;
            }
            while (nums[end] > pivot) {
                end--;
            }

            if (start <= end) {
                // swap
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;

            }
        }

        // Now my pivot is at correct index, please sort tow halves now
        sort(nums, low, end);
        sort(nums, start, hi);
    }

}
