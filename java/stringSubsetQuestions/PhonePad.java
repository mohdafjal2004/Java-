package stringSubsetQuestions;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        pad("", "12");
        System.out.println(padRet("", "12"));

    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        // Getting digits from up in form of number
        int digit = up.charAt(0) - '0'; // This convert '2' into 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            // So now character is going to be added
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));

        }
    }

    // Now in ArrayList form
    static ArrayList<String> padRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // Getting digits from up in form of number
        int digit = up.charAt(0) - '0'; // This convert '2' into 2

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            // So now character is going to be added
            char ch = (char) ('a' + i);
            list.addAll(padRet(p + ch, up.substring(1)));

        }

        return list;
    }
}
