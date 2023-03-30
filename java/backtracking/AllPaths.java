
//Here we can take any directions to reach the goal
package backtracking;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = { { true, true, true }, { true, true, true }, { true, true, true } };
        allpaths("", board, 0, 0);
    }

    static void allpaths(String p, boolean[][] maze, int row, int col) {
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
            allpaths(p + 'D', maze, row + 1, col);// For down path
        }

        if (col < maze[0].length - 1) {
            allpaths(p + 'R', maze, row, col + 1);// For right path
        }

        if (row > 0) {
            allpaths(p + 'U', maze, row -1 , col);// For upper path
        }

        if (col > 0) {
            allpaths(p + 'L', maze, row, col - 1);// For left path
        }

        // This line is where the function calling will be over
        // So before the function gets removed, also remove the changes that were made
        // by that function
        maze[row][col] = true;
    }

}
