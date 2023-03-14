package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        pattern(6);
    }

    static void pattern(int n) {
        // Method-1
        for (int row = 1; row <= n; row++) {
            for (int col = n; col > row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Method-2
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
