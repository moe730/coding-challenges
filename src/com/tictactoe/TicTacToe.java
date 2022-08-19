package com.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    //create a simple tic tac toe board in java

    public void printBoard(char[][] board) {
        System.out.println(board[0][0]+"|"+ board[0][1]+"|"+ board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0]+"|"+ board[1][1]+"|"+ board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0]+"|"+ board[2][1]+"|"+ board[2][2]);
    }
    public  void playerMove(char[][] board) {
        String userInput;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("where would you like to play? (1-9)");
             userInput = input.nextLine();
            if(isValidMove(board,userInput)){
                System.out.println("user input " +userInput);
                placeMove(board, userInput, 'x');
                break;
            }else{
                System.out.println(userInput+" is not a valid move try again ");
            }
            System.out.println(userInput);
           // placeMove(board, userInput, 'x');
        }
    }


    public void computerMove(char[][] board) {
        Random rand = new Random();
        int computerMove;
        while(true){
            computerMove = rand.nextInt(9)+1;
            if(isValidMove(board,Integer.toString(computerMove))){
                break;
            }
        }
        System.out.println("computer chose "+computerMove);
        placeMove(board,Integer.toString(computerMove),'o');
        //int computerPlay=rand.nextInt(9+1);
    }


    public void placeMove(char[][] board, String position, char symbol) {
        switch (position){
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;
            default:
                System.out.println("you did not input a correct number ");
        }
    }

    public boolean isValidMove(char[][]board, String position){

       switch (position){
           case "1":
               return (board[0][0] == ' ');
           case "2":
               return (board[0][1] == ' ');
           case "3":
               return (board[0][2] == ' ');
           case "4":
               return (board[1][0] == ' ');
           case "5":
               return (board[1][1] == ' ');
           case "6":
               return (board[1][2] == ' ');
           case "7":
               return (board[2][0] == ' ');
           case "8":
               return (board[2][1] == ' ');
           case "9":
               return (board[2][2] == ' ');
           default:

               System.out.println("not a valid move  ");
               return false;
       }


   }
   public boolean isGameFinished(char[][] board){

       if (hasContestestantWon(board,'x')) {
           System.out.println("player has won");
           return true;
       }
       if (hasContestestantWon(board,'o')){
           System.out.println("computer won");
           return true;
       }


       for (int i = 0; i < board.length; i++) {
         for (int j = 0; j <board[i].length ; j++) {
           if (board[i][j] == ' '){
               return false;
           }
         }
       }
       printBoard(board);
       System.out.println("the game ended in a tie ");
       return true;
   }

    public boolean hasContestestantWon(char[][] board,char symbol) {
        if ((board[0][0]==symbol && board[0][1]==symbol && board[0][2]==symbol)||
           (board[1][0]==symbol && board[1][1]==symbol && board[1][2]==symbol) ||
                (board[2][0]==symbol && board[2][1]==symbol && board[2][2]==symbol)||
                //row
                (board[0][0]==symbol && board[1][0]==symbol && board[2][0]==symbol)||
                (board[0][1]==symbol && board[1][1]==symbol && board[2][1]==symbol) ||
                (board[0][2]==symbol && board[1][2]==symbol && board[2][2]==symbol)||
                //diagonal
                (board[0][0]==symbol && board[1][1]==symbol && board[2][2]==symbol)||
                (board[0][2]==symbol && board[1][1]==symbol && board[2][0]==symbol)){
            //printBoard(board);
           // System.out.println("player wins: ");
            return true;
        }
        return false;
    }
}
