
//Here we can take any directions to reach the goal
package backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = { { true, true, true }, { true, true, true }, { true, true, true } };
        allpath("", board, 0, 0);

        int[][] path = new int[board.length][board[0].length];
        allpathPrint("", board, 0, 0, path, 1);
    }

    // Just printing the path
    static void allpath(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        // or handling obstatcles
        if (!maze[row][col]) {
            return;
        }

        // I am considering this block in my path
        maze[row][col] = false;

        if (row < maze.length - 1) {
            allpath(p + 'D', maze, row + 1, col);// For down path
        }

        if (col < maze[0].length - 1) {
            allpath(p + 'R', maze, row, col + 1);// For right path
        }

        if (row > 0) {
            allpath(p + 'U', maze, row - 1, col);// For upper path
        }

        if (col > 0) {
            allpath(p + 'L', maze, row, col - 1);// For left path
        }

        // This line is where the function calling will be over
        // So before the function gets removed, also remove the changes that were made
        // by that function
        // Basically removing the history of paths covered => Backtracking
        maze[row][col] = true;
    }

    // Printing the path as matrix
    static void allpathPrint(String p, boolean[][] maze, int row, int col, int[][] path, int step) {

        // Base-condition
        if (row == maze.length - 1 && col == maze[0].length - 1) {

            // Last step
            path[row][col] = step;

            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        // or handling obstatcles
        if (!maze[row][col]) {
            return;
        }

        // I am considering this block in my path
        maze[row][col] = false;
        path[row][col] = step;

        if (row < maze.length - 1) {
            allpathPrint(p + 'D', maze, row + 1, col, path, step + 1);// For down path
        }

        if (col < maze[0].length - 1) {
            allpathPrint(p + 'R', maze, row, col + 1, path, step + 1);// For right path
        }

        if (row > 0) {
            allpathPrint(p + 'U', maze, row - 1, col, path, step + 1);// For upper path
        }

        if (col > 0) {
            allpathPrint(p + 'L', maze, row, col - 1, path, step + 1);// For left path
        }

        // This line is where the function calling will be over
        // So before the function gets removed, also remove the changes that were made
        // by that function
        // Basically removing the history of paths covered => Backtracking
        maze[row][col] = true;
        path[row][col] = 0;
    }

}
