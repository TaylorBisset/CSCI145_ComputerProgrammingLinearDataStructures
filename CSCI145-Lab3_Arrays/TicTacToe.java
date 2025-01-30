// TicTacToe.java

// Author: Taylor Bisset
// Description: Lab 3, CSCI 145
// Date: Jan 29,2025

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.run();
    }

    private String[][] board;

    public TicTacToe() {
        board = new String[3][3];
    }

    public void run() {
        final String INVALID_BOARD_MESSAGE = "Sorry, you can only enter x's and o's.";
        initBoard();
        printBoard();
        if (!isBoardValid()) {
            System.out.println(INVALID_BOARD_MESSAGE);
            return;
        }
        determineWinner();
    }

    private void initBoard() {
        final String INIT_BOARD_MESSAGE = "Enter x's and o's on board (L-R, T-B): ";
        System.out.print(INIT_BOARD_MESSAGE);
        Scanner input = new Scanner(System.in);
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = input.next();
            }
        }
    }

    private void printBoard() {
        final String BOARD_BORDER = "\n+---+---+---+\n";
        final String ROW_START = "| ";
        final String ROW_DIVIDER = "%s | ";
        System.out.print(BOARD_BORDER);
        for (int r = 0; r < 3; r++) {
            System.out.print(ROW_START);
            for (int c = 0; c < 3; c++) {
                System.out.printf(ROW_DIVIDER, board[r][c]);
            }
            System.out.print("\n" + BOARD_BORDER);
        }
    }

    private boolean isBoardValid() {
        // Check board contains only x's and o's
        // To Be Implemented
        return true;
    }

    private void determineWinner() {
        final String WINNER_MESSAGE = "Congratulations %s is the winner!\n";
        final String NO_WINNER_MESSAGE = "Sorry, no one wins.";
        String winner = null;
        // Check first diagonal to see who wins
        if (board[0][0].equals(board[1][1]) &&
                board[1][1].equals(board[2][2])) {
            winner = board[0][0];
        }
        // Check second diagonal to see who wins
        // To Be Implemented
        // Check rows to see who wins
        for (int r = 0; r < board.length; r++) {
            if ((board[r][0].equals(board[r][1])) &&
                    (board[r][1].equals(board[r][2]))) {
                winner = board[r][0];
            }
        }
        // Check columns to see who wins
        // To Be Implemented
        // Print winner
        if (winner != null) {
            System.out.printf(WINNER_MESSAGE, winner);
        } else {
            System.out.println(NO_WINNER_MESSAGE);
        }
    }
}
