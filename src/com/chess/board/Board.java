package com.chess.board;

public class Board {
    public static void printPlayer1Board(String[][] board) {
        for (int i = 0; i < 8; i++) {
            for (int k = 0; k < 4 || (k == 4 && i == 7); k++) {
                for (int j = 0; j < 8; j++) {
                    for (int l = 0; l < 4 || (l == 4 && j == 7); l++) {
                        if (j == 0 && l == 0) {
                            if (k == 2) {
                                System.out.print(8 - i + " ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        if (k == 0 || l == 0 || k == 4 || l == 4) {
                            System.out.print("# ");
                        } else if (k == 2 && l == 2 && board[i][j] != null) {
                            System.out.print(board[i][j] + " ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                }
                System.out.println();
            }
        }
        char file = 'a';
        for (int m = 0; m < 8; m++) {
            System.out.print("      " + file + " ");
            file++;
        }
    }

    public static String[][] getIntialBoard() {
        String[][] board = new String[8][8];
        board[0][0] = "r";
        board[0][1] = "n";
        board[0][2] = "b";
        board[0][3] = "k";
        board[0][4] = "q";
        board[0][5] = "b";
        board[0][6] = "n";
        board[0][7] = "r";
        for (int j = 0; j < 8; j++) {
            board[1][j] = "p";
        }
        for (int j = 0; j < 8; j++) {
            board[6][j] = "P";
        }
        board[7][0] = "R";
        board[7][1] = "N";
        board[7][2] = "B";
        board[7][3] = "K";
        board[7][4] = "Q";
        board[7][5] = "B";
        board[7][6] = "N";
        board[7][7] = "R";

        return board;
    }
}
