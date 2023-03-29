package backtracking;

public class RecursionWithRestriction {
    public static void main(String[] args) {

    }

    // Printing the Actual path from (3,3) to (0,0)
    static void pathRestrictions(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (row > 1) {
            pathRestrictions(p + 'D', row - 1, col);// For left path
        }

        if (col > 1) {
            pathRestrictions(p + 'R', row, col - 1);// For right path
        }
    }

}
