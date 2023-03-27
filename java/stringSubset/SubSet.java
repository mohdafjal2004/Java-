//Here we are focusing on printing Subset using 𝗜𝘁𝗲𝗿𝗮𝘁𝗶𝗼𝗻
package stringSubset;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }

    }

    static List<List<Integer>> subset(int[] arr) {// List<List<Integer>> = List of lists of integer

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        // For every number in my array,add it in the original list
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {

                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;

    }

}
