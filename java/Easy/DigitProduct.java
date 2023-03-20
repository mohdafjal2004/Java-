package Easy;

public class DigitProduct {

    public static void main(String[] args) {
        int ans = product(12345);
        System.out.println(ans);
    }

    static int product(int n) {
        // another important concept and must remember base-condition
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * product(n / 10);
    }
}
