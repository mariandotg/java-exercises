package com.mariandotg.exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board = {{'.','.','.'}, {'.','.','.'}, {'.','.','.'}};
        Scanner scanner = new Scanner(System.in);
        String currentPlayer = "X";
        String winner = "";

        while (winner.equals("")) {
            drawBoard(board);
            System.out.println("Player " + currentPlayer + " enter a row");
            int row = scanner.nextInt();
            System.out.println("Player " + currentPlayer + " enter a column");
            int col = scanner.nextInt();

            board[row][col] = currentPlayer.toCharArray()[0];
            if (currentPlayer.equals("X")) {
                currentPlayer = "O";
            } else {
                currentPlayer = "X";
            }
        }
    }

    public static void drawBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if(i == 0) {
                System.out.println("┌───┬───┬───┐");
            }
            System.out.println("| " + board[i][0] + " | " + board[i][1] + " | " + board[i][2] + " |");
            if(i == board.length - 1) {
                System.out.println("└───┴───┴───┘");
            } else {
                System.out.println("│───│───│───│");
            }
        }

    }
}