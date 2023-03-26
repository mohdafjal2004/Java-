//Here we are  making Subsets using recursion

package stringSubset;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        subseq("", "abc");
        System.out.println(subseqReturn("", "abc"));

    }

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        // Now make two recursion call, i.e add it or ignore it
        subseq(p + ch, up.substring(1));// Adding

        subseq(p, up.substring(1));// Ignoring

    }

    // Now we want to return a ArrayList of String
    static ArrayList<String> subseqReturn(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        // Now make two recursion call, i.e add it or ignore it
        ArrayList<String> left = subseqReturn(p + ch, up.substring(1));// Adding

        ArrayList<String> right = subseqReturn(p, up.substring(1));// Ignoring

        left.addAll(right);
        return left;

    }

}
