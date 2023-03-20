package ArrayRecursion;

import java.util.ArrayList;

public class DuplicatLinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5 };
        // Here 4 is duplicate and occured at multiple indices so find those indices
        // So multiple value we use ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndex2(arr, 4, 0);
        System.out.println(ans);
        System.out.println(list);

        System.out.println(findAllIndex2(arr, 4, 0));

    }

    // Approach 1: find the indices of the all duplicate elements from start of the
    // elements using L.S.A in recursion

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return findAllIndex(arr, target, index + 1, list);

    }

    // Approach 2 : Suppose we can't pass the arraylist in the argument of the
    // function and has
    // to use the same in the body
    // Not optimized approach
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }

        // filling the empty list with the index value when it goes from below to the
        // main method
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }

}
