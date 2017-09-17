
/**
 * Tic Tac Toe Game
 * 
 * @author Haley Ittner 
 * @version 9.13.2015
 */
// Importing the Scanner from Java.
import java.util.Scanner;
// Class called Tic Tac Toe.
public class TicTacToe
{
    //The char of whose turn it is.
    private static char currentTurn = 'X';
    //Array of chars with 9 positions, 0-8.
    private static char[] positions = new char[9];
    // The imported Scanner called doodoos.
    private static Scanner doodoos;
    
    // Main Method
    public static void main(String[] args)
    {
        // Instantiate method being called.
        instantiate();
        // PrintBoard method being called.
        printBoard();
        // Scanner Doodoos being made and having a input.
        doodoos = new Scanner(System.in);
        // The question the Scanner asks.
        System.out.println("What's yo name, foo?");
        // The answer to above repeated.
        System.out.println(doodoos.next());
        // DoMove method.
        doMove();
        // For loop to make game run turn by turn.
        for(int x = 0; x < positions.length; x++)
        {
            doMove();
            printBoard();
        }
    }
    // Instantiate method, making the board spaces where the x's and o's will go.
    public static void instantiate()
    {
        /** 
         * A for loop, starting at position 0, only going through positions below 9,
         * and adding 1 to x each time (x++) to make a space.
         */
        for(int x = 0; x < positions.length; x++)
        {
           positions[x] = ' ';
        }
    }
    // PrintBoard method.
    public static void printBoard()
    {
        /** 
         * Another 4 loop, same as before but with x + 3 for the lines in the board.
         */
        for(int x = 0; x < positions.length; x += 3)
        {
            // Printing the board itself
            System.out.println(positions[x] + " | " + positions[x + 1] + " | " + positions[x + 2]);
            // Stopping the lines at the bottom of the board by only printing a line if x < 6.
            if(x < 6){
            System.out.println("----------");
           }
        }
    }
    // The DoMove method to make a move happen and tell the user whose turn it is.
    public static void doMove()
    {
        // Printing the currents persons turn.
        System.out.println("It is " + currentTurn + "'s turn, ya doofs");
        // Printing the question for a position.
        System.out.println("Where ya want your thingy?");
        /**
         * Using the Scanner method NextInt to put the current turn char in the position the user
         * chose. 
         */
        positions[doodoos.nextInt()] = currentTurn;
        // If statement that changes X to O after X's turn. If it was Os turn it goes back to X.
        if('X' == currentTurn) currentTurn = 'O';
        else currentTurn = 'X';
    }
}
