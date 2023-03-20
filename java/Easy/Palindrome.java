package Easy;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palin(123454321));
    }

    // first reverse the number
    static int reverse(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function

        int digits = (int) (Math.log10(n) + 1);
        return helper(n, digits);

    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    // And then compare the number with the reversed number
    static boolean palin(int n) {
        return n == reverse(n);
    }
}
