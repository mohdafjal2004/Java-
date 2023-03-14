package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }

    static int fibo(int n) {

        // base-condition
        if (n < 2) {
            return n;
        }

        // nth-fibonacci number
        return fibo(n - 1) + fibo(n - 2);// this is not tale recursion
        // becoz this is not last function call becoz inside this call there are 2 calls and
        // in each call there again 2 calls, and this goes on.
    }

}
