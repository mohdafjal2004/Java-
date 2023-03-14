package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        pattern(5);
        // patternreverse(4);

    }

    static void pattern(int n) {
        // Method-1: Simply add upper & lower pattern but that is not optimised
        // Method-2:Optimised and applicable for all values of n
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
