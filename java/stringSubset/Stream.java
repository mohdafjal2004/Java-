package stringSubset;

public class Stream {
    public static void main(String[] args) {
        skip("", "baccad");// We have to print up string without a
        System.out.println(skip2("baccad"));
        ;
    }

    // Approach 1
    static void skip(String p, String up) {// up = unprocessed/original string, p = processed string
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            // skip this a
            skip(p, up.substring(1));

        } else {
            skip(p + ch, up.substring(1));
        }
    }

    // Approach 2
    static String skip2(String up) {// up = unprocessed/original string, p = processed string
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            // skip this a
            return skip2(up.substring(1));

        } else {
            return ch + skip2(up.substring(1));
        }
    }

}
