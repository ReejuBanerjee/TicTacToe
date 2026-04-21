/**
 * UC1: Initializes and displays an empty Tic-Tac-Toe board.
 * Focuses on 2D arrays, nested loops, and formatted console output.
 * * @author Reeju Banerjee
 * @version 1.0
 */
public class UC1 {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        initializeBoard();
        printBoard();
    }

    /**
     * Fills the 2D array with '-' to represent empty slots.
     */
    static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    /**
     * Prints the board to the console with visual separators.
     */
    static void printBoard() {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}