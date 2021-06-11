import java.util.*;
public class TicTacToe
{   
    private char[][] board;
    private static String player1;
    private static String player2;
    private static char char1;
    private static char char2;
    private static int i;
    private static String number;
    static String checkWinner(char[][] gameBoard)
    {
        String result = "";
        char[][] board = gameBoard;
        char line = ' ';
        for (int a = 0; a < 8; a++) 
        {
            switch (a) 
            {
            case 0:
                line = (char)(board[0][0] + board[0][2] + board[0][4]);
                break;
            case 1:
                line = (char)(board[2][0] + board[2][2] + board[2][4]);
                break;
            case 2:
                line = (char)(board[4][0] + board[4][2] + board[4][4]);
                break;
            case 3:
                line = (char)(board[0][0] + board[2][0] + board[4][0]);
                break;
            case 4:
                line = (char)(board[0][2] + board[2][2] + board[4][2]);
                break;
            case 5:
                line = (char)(board[0][4] + board[2][4] + board[4][4]);
                break;
            case 6:
                line = (char)(board[0][0] + board[2][2] + board[4][4]);
                break;
            case 7:
                line = (char)(board[0][4] + board[2][2] + board[4][0]);
                break;
            }
            if (line == char1 + char1 + char1) 
            {
                result = player1 + " wins!";
                System.out.println(result);
                break;
            }
            
              

            else if (line == char2 + char2 + char2) 
            {
                result = player2 + " wins!";
                System.out.println(result);
                break;
            }
            else
            {
                result = "";
                System.out.print(result);
            }
        }

        return result;
    }
    static void createPlayer1(String player1Name, char player1Char)
    {
        player1 = player1Name;
        char1 = player1Char;
    }
    static void createPlayer2(String player2Name, char player2Char)
    {
        player2 = player2Name;
        char2 = player2Char;
    }
    static String getPlayer1()
    {
        return player1;
    }
    static String getPlayer2()
    {
        return player2;
    }
    static void returnGameBoard(char[][] gameBoard)
    {
        for(int i = 0; i < 5; i++)
        {
            char[] row = gameBoard[i];
            for(int j = 0; j < 5; j++)
            {
                char c = row[j];
                System.out.print(c);
            }
            System.out.println();
        }
    }
    static String check(int integer)
    {
        i = integer;
        if (i % 2 == 0)
        {
            number = "even";
        }
        if (i % 2 == 1)
        {
            number = "odd";
        }
        return number;
    }
}
