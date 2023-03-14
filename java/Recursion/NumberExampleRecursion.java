package Recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        // Write a function that takes in a number and print it
        // print first 5 numbers: 1 2 3 4 5
        print(1);
    }

    static void print(int n) {

        // base-condition of recursion
        if (n == 5) {
            System.out.println(5);
            return;
        }

        System.out.println(n);

        // this is called tale recursion
        // this is last function call
        print(n + 1);// recursive call
        // If you are calling a function again and again, you can treat it
        // as a separate call/function in the stack
    }

}
