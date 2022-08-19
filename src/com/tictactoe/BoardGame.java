package com.tictactoe;


import java.util.Random;

public class BoardGame {
    public static void main(String[] args) {

        TicTacToe game = new TicTacToe();

        //this is the board game
        char[][] board = {{' ',' ',' '},
                          {' ',' ',' '},
                          {' ',' ',' '}};

        game.printBoard(board);
        while (true){
            game.playerMove(board);
            if(game.isGameFinished(board)){
                break;
            }
            game.printBoard(board);
            game.computerMove(board);
            if (game.isGameFinished(board)) {
                break;
            }
            game.printBoard(board);
        }
        game.printBoard(board);




    }




}
