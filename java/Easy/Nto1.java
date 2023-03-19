package Easy;

public class Nto1 {
    public static void main(String[] args) {
        // fun(5);
        // funReverse(5);
        funboth(5);
    }

    // for printing from 𝟱 𝘁𝗼 𝟭
    static void fun(int n) {

        // base-condition
        if (n == 0) {
            return;
        }
        System.out.println(n);

        // recursive calls
        fun(n - 1);

    }

    // for printing from 𝟭 𝘁𝗼 𝟱
    static void funReverse(int n) {

        // base-condition
        if (n == 0) {
            return;
        }

        // recursive calls
        funReverse(n - 1);// Here first we decrease the number and
        // then print the required number at last in the stack
        System.out.println(n);
    }

    // for printing from 𝟱 𝘁𝗼 𝟭 and then printing from 𝟭 𝘁𝗼 𝟱
    static void funboth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        funboth(n - 1);
        System.out.println(n);

    }
}
