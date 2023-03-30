package backtracking;

public class RecursionWithRestriction {
    public static void main(String[] args) {
        boolean[][] board = { { true, true, true }, { true, false, true }, { true, true, true } };
        pathRestrictions("", board, 0, 0);

    }

    // Printing the Actual path from (3,3) to (0,0)
    static void pathRestrictions(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        // or handling obstatcles
        if (!maze[row][col]) { 
            return;
        }

        if (row < maze.length - 1) {
            pathRestrictions(p + 'D', maze, row + 1, col);// For down path
        }

        if (col < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, row, col + 1);// For right path
        }
    }

}
