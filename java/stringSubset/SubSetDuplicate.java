package stringSubset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2 };
        List<List<Integer>> ans = subsetDuplicate(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }

    }

    static List<List<Integer>> subsetDuplicate(int[] arr) {// List<List<Integer>> = List of lists of integer

        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        // For every number in my array,add it in the original list
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if start and previous element is same, start = end + 1
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;

            int n = outer.size();
            for (int j = 0; j < n; j++) {

                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;

    }

}
