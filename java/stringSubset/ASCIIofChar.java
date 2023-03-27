package stringSubset;

import java.util.ArrayList;

public class ASCIIofChar {
    public static void main(String[] args) {
        subseqAscii("", "abc");
        System.out.println(subseqAsciiRet("", "abc"));
    }

    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        // Now make two recursion call, i.e add it or ignore it
        subseqAscii(p + ch, up.substring(1));// Adding

        subseqAscii(p, up.substring(1));// Ignoring
        subseqAscii(p + (ch + 0), up.substring(1));// Ignoring

    }

    // Returning it in the  form of Array using ArrayList
    static ArrayList<String> subseqAsciiRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        // Now make two recursion call, i.e add it or ignore it
        ArrayList<String> first = subseqAsciiRet(p + ch, up.substring(1));// Adding

        ArrayList<String> second = subseqAsciiRet(p, up.substring(1));// Ignoring
        ArrayList<String> third = subseqAsciiRet(p + (ch + 0), up.substring(1));// Ignoring

        first.addAll(second);
        first.addAll(third);
        return first;

    }

}
