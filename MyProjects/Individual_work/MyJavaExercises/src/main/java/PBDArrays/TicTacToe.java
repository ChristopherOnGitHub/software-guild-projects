/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBDArrays;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {

        initBoard();
        displayBoard();
        Scanner userInput = new Scanner(System.in);
        int numberTurns = 0;
        int x;
        int y;
        board[1][1]='!';
        board[0][0]='_';
        board[2][2]='_';
        board[0][2]='_';
        board[2][0]='_';

        while (((board[0][0] != board[0][1]) || (board[0][0] != board[0][2]))
                && ((board[1][0] != board[1][1]) || (board[1][0] != board[1][2]))
                && ((board[2][0] != board[2][1]) || (board[2][0] != board[2][2]))
                && ((board[0][0] != board[1][0]) || (board[1][0] != board[2][0]))
                && ((board[0][1] != board[1][1]) || (board[1][1] != board[2][1]))
                && ((board[0][2] != board[1][2]) || (board[1][2] != board[2][2]))
                && ((board[0][0] != board[1][1]) || (board[1][1] != board[2][2]))
                && ((board[2][0] != board[1][1]) || (board[1][1] != board[0][2]))
                && (numberTurns < 9)) {

            numberTurns++;
            
            do{
            System.out.println("Player X, please give coordinate");
            x = userInput.nextInt();
            y = userInput.nextInt();
            
            }while((x<0||x>2)||(y<0||y>2));
            
            board[x][y] = 'X';
            displayBoard();
            System.out.println("  ");
            
            if(numberTurns<9){for(int i =0; i<1; i++){
            numberTurns++;
            
            do{
            System.out.println("Player O, please give coordinate");
            x = userInput.nextInt();
            y = userInput.nextInt();
            
            }while((x<0||x>2)||(y<0||y>2));
            
            board[x][y] = 'O';
            displayBoard();
            System.out.println("  ");
            }
            }
        }
        if(numberTurns>=9){
            System.out.println("IT'S A TIE!");
        }else{
            System.out.println("WINNER!");
        }

    }

    public static void initBoard() {

        // fills up the board with blanks
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = ' ';
            }
        }
        board[1][1]='.';
        board[0][0]='_';
        board[2][2]='_';
        board[0][2]='_';
        board[2][0]='_';

    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static void displayBoard2() {
        for (int r = 0; r < 3; r++) {
            System.out.print("\t" + r + " ");
            for (int c = 0; c < 3; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println("\t  0 1 2 ");
    }

}
