package com.mariandotg.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int boardColsCant = 3;
        int boardRowsCant = 3;
        int boardCellsCant = boardRowsCant * boardColsCant;
        char[][] board = new char[boardRowsCant][boardColsCant];
        char count = '1';

        for (int r = 0; r < boardRowsCant; r++) {
            for (int c = 0; c < boardColsCant; c++) {
                board[r][c] = count;
                count++;
            }
        }

        Scanner scanner = new Scanner(System.in);
        String currentPlayer = "X";
        String winner = "";
        List<int[]> winningCells = new ArrayList<>();

        while (winner.isEmpty()) {
            drawBoard(board, winningCells);

            System.out.println("Player " + currentPlayer + " enter the cell number where do you want to place your mark");
            int cellNumber = scanner.nextInt() - 1;

            char selectedCell = board[cellNumber / boardRowsCant][cellNumber % boardColsCant];

            if(selectedCell != 'X' && selectedCell != 'O') {
                board[cellNumber / boardRowsCant][cellNumber % boardColsCant] = currentPlayer.charAt(0);
                winner = checkWinner(board, winningCells);

                if (winner.isEmpty()) {
                    currentPlayer = currentPlayer.equals("X") ? "O" : "X";
                } else {
                    drawBoard(board, winningCells);
                    System.out.println("Player " + winner + " wins!");
                }
            } else {
                System.out.println("Cell already taken, please choose another.");
            }
        }
    }

    public static void drawBoard(char[][] board, List<int[]> winningCell) {
        for (int i = 0; i < board.length; i++) {
            if(i == 0) {
                System.out.println("┌───┬───┬───┐");
            }
            System.out.println("| " + colorCell(board[i][0], winningCell, i, 0) + " | " + colorCell(board[i][1], winningCell, i, 1) + " | " + colorCell(board[i][2], winningCell, i, 2) + " |");
            if(i == board.length - 1) {
                System.out.println("└───┴───┴───┘");
            } else {
                System.out.println("│───│───│───│");
            }
        }
    }

    public static String colorCell(char cellValue, List<int[]> winningCells, int row, int col) {
        for (int[] cell : winningCells) {
            if (cell[0] == row && cell[1] == col) {
                return "\u001B[32m" + cellValue + "\u001B[0m";
            }
        }
        if (cellValue != 'X' && cellValue != 'O') {
            return "\u001B[31m" + cellValue + "\u001B[0m";
        }
        return "\u001B[33m" + cellValue + "\u001B[0m";
    }

    public static String checkWinner(char[][] board, List<int[]> winningCells) {
        for (int i = 0; i < board.length; i++) {
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                winningCells.add(new int[]{i, 0});
                winningCells.add(new int[]{i, 1});
                winningCells.add(new int[]{i, 2});
                return String.valueOf(board[i][0]);
            }
            if(board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                winningCells.add(new int[]{0, i});
                winningCells.add(new int[]{1, i});
                winningCells.add(new int[]{2, i});
                return String.valueOf(board[0][i]);
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            winningCells.add(new int[]{0, 0});
            winningCells.add(new int[]{1, 1});
            winningCells.add(new int[]{2, 2});
            return String.valueOf(board[0][0]);
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            winningCells.add(new int[]{0, 2});
            winningCells.add(new int[]{1, 1});
            winningCells.add(new int[]{2, 0});
            return String.valueOf(board[0][2]);
        }
        return "";
    }
}