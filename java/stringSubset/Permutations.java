package stringSubset;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        // permutation("", "abc"); //<= Printing Permutation combinations

        // ArrayList<String> ans = permutationList("", "abc");
        // System.out.println(ans); // <= Printing Permutation combination in List

        System.out.println(permutationCount("", "abc")); // <= No. of permutations combinations 
    }

    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutation(first + ch + second, up.substring(1));
        }
    }

    static int permutationCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count = count + permutationCount(first + ch + second, up.substring(1));
        }
        return count;
    }

    static ArrayList<String> permutationList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutationList(first + ch + second, up.substring(1)));
        }

        return ans;
    }

}
