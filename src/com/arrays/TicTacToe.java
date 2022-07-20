package com.arrays;

import java.util.Scanner;

public class TicTacToe {
    public static final int SIZE = 3;
    public static final char EMPTY = '_';
    public static final char CROSS = 'x';
    public static final char ZERO = '0';

    public static void main(String[] args) {
        char[][] field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY;
            }
        }
        Scanner scan = new Scanner(System.in);

        boolean isCrossTurn = true;

        while (true) {
            System.out.println("Go " + (isCrossTurn ? "x" : "0"));
            printField(field);
            String input = scan.nextLine(); // "1 2"
            String[] parts = input.split(" "); //["1", "2"]
            int x = Integer.parseInt(parts[0]) - 1;
            int y = Integer.parseInt(parts[1]) - 1;

            //error checking
            if (field[x][y] != EMPTY) {
                continue;
            }
            field[x][y] = isCrossTurn ? CROSS : ZERO;

            //won the crosses
            if (isWin(field, isCrossTurn ? CROSS : ZERO)) {
                System.out.println("Won the " + (isCrossTurn ? "Crosses" : "Zero"));
                printField(field);
                break;
            } else {
                if (isCrossTurn) {
                    isCrossTurn = false;
                } else {
                    isCrossTurn = true;
                }
            }
        }
    }

    //only for a field of size 3*3!
    public static boolean isWin(char[][] field, char player) {
        // rows
        if (field[0][0] == player && field[0][1] == player && field[0][2] == player) {
            return true;
        }
        if (field[1][0] == player && field[1][1] == player && field[1][2] == player) {
            return true;
        }
        if (field[2][0] == player && field[2][1] == player && field[2][2] == player) {
            return true;
        }
        //columns
        if (field[0][0] == player && field[1][0] == player && field[2][0] == player) {
            return true;
        }
        if (field[0][1] == player && field[1][1] == player && field[2][1] == player) {
            return true;
        }
        if (field[0][2] == player && field[1][2] == player && field[2][2] == player) {
            return true;
        }
        //diagonals
        if (field[0][0] == player && field[1][1] == player && field[2][2] == player) {
            return true;
        }
        if (field[2][0] == player && field[1][1] == player && field[0][2] == player) {
            return true;
        }
        return false;
    }

    public static void printField(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
