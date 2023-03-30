package backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        path("", 3, 3);

        System.out.println(pathRet("", 3, 3));
        System.out.println(pathRetDiagonal("", 3, 3));
    }

    // No. of paths from (3,3) to (0,0)
    static int count(int row, int col) {

        // Base-condition
        if (row == 1 || col == 1) {
            return 1;
        }

        int down = count(row - 1, col);
        int right = count(row, col - 1);
        return down + right;
    }

    // Printing the Actual path from (3,3) to (0,0)
    static void path(String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }

        if (row > 1) {
            path(p + 'D', row - 1, col);// For down path
        }

        if (col > 1) {
            path(p + 'R', row, col - 1);// For right path
        }
    }

    // Printing the path using ArrayList from (3,3) to (0,0)
    static ArrayList<String> pathRet(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (row > 1) {
            list.addAll(pathRet(p + 'D', row - 1, col));// For down path
        }

        if (col > 1) {
            list.addAll(pathRet(p + 'R', row, col - 1));// For Right path
        }
        return list;
    }

    // Printing the path imcluding 𝗱𝗶𝗮𝗴𝗼𝗻𝗮𝗹 using ArrayList from (3,3) to
    // (0,0)
    static ArrayList<String> pathRetDiagonal(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (row > 1) {
            list.addAll(pathRetDiagonal(p + 'V', row - 1, col));// For down path
        }

        if (col > 1) {
            list.addAll(pathRetDiagonal(p + 'H', row, col - 1));// For right path
        }
        if (row > 1 && col > 1) {
            list.addAll(pathRetDiagonal(p + 'D', row - 1, col - 1));// For Diagonal path
        }
        return list;
    }

}
