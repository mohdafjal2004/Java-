package PatternRecursion;

public class Triangle2 {
    public static void main(String[] args) {
        triangle(4, 0);
    }

    static void triangle(int row, int col) {

        // base-condition
        if (row == 0) {
            return;
        }

        // 𝗣𝗿𝗶𝗻𝘁𝗶𝗻𝗴 𝘁𝗵𝗲 𝘀𝘁𝗮𝗿𝘀
        if (col < row) {
            triangle(row, col + 1);
            System.out.print("* ");

            // Moving to next line
        } else {
            triangle(row - 1, 0);// Start printing stars
            System.out.println();// new line

        }
    }

}
