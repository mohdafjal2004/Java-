package backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, 4);
    }

    static void knight(boolean[][] board, int row, int col, int knights) {

        // edge-case-1: If not Knights left to place
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }
            // edge-case-2: If at last position of a row, Moving to next row
            if (col == board.length) {
                knight(board, row + 1, 0, knights);
                return;
            }

            // edge-case-3: If at last element of entire board[][]
            if (row == board.length - 1 && col == board.length) {
                return;

            }

            if (isSafe(board, row, col)) {// if safe reduce the knight and move ahead
                board[row][col] = true;// Normal Recursion
                knight(board, row, col + 1, knights - 1);

                // After Printing the elements, backtracking the elements
                board[row][col] = false;

            }

            // if not safe, don't reduce the knight and move ahead
            knight(board, row, col + 1, knights);

        }
    

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // For understanding these conditions refer to notes
        // Conditon-1
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }
        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }
        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }

    // Do not repeat yourself, hence created this function
    static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
 
        return false;

    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print(" K");
                } else {
                    System.out.print(" X");
                }
            }
            System.out.println();
        }
    }

}
