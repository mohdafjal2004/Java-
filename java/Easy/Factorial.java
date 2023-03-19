package Easy;

public class Factorial {
    public static void main(String[] args) {
       int ans =  factorial(5);
       System.out.println(ans);

    }

    static int factorial(int n) {
        // base-condtion
        if (n <= 1) {
            return 1;
        }

        // recursive-call
        return n * factorial(n - 1);
    }
}
