package Easy;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = digit(12345);
        System.out.println(ans);
    }

    static int digit(int n) {
        // base-condition
        if (n == 0) {
            return 0;

        }

        return digit(n / 10) + (n % 10);
        // digit(n / 10) means number left after removing remainder
        // n%10 gives last digit of the number
    }
}
