package Easy;

public class ReverseNumber1 {
    public static void main(String[] args) {
        ;
        System.out.println(reverse2(12345));
    }

    // Method-1: taking a varible(sum) out side function
    static int sum = 0;

    static void reverse1(int n) {
        if (n == 0) {
            return;

        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse1(n / 10);
    }

    // Method2: Not taking any variable outside function

    static int reverse2(int n) {
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
}
