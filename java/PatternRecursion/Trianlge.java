package PatternRecursion;

public class Trianlge {
    public static void main(String[] args) {
        triangle(4,0);
    }

    static void triangle(int row, int col) {

        // base-condition
        if (row == 0) {
            return;
        }

        //𝗣𝗿𝗶𝗻𝘁𝗶𝗻𝗴 𝘁𝗵𝗲 𝘀𝘁𝗮𝗿𝘀
        if (col < row) {
            System.out.print("* ");
            triangle(row, col + 1);

            //Moving to next line
        } else {
            System.out.println();// new line
            triangle(row - 1, 0);//Start printing stars

        }
    }

}
