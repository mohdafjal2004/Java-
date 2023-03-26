package stringSubset;

//This class focuses on skipping a string from a parent string
public class StreamString {

    public static void main(String[] args) {
        System.out.println(skipApple("asdkhghaigapplesws"));
        System.out.println(skipAppNotApple("asdkhghaigapplesws"));

    }

    static String skipApple(String up) {// up = unprocessed/original string, p = processed string
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            // skip this a
            return skipApple(up.substring(5));
            // After we found apple in the string, skip the first 5 character

        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    // Only skip the app, when it is not equal to apple
    static String skipAppNotApple(String up) {// up = unprocessed/original string, p = processed string
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            // skip this a
            return skipAppNotApple(up.substring(3));
            // After we found apple in the string, skip the first 5 character

        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
