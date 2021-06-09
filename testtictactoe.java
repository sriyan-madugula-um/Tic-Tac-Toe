import java.util.*;
public class TicTacToeTester
{   
    private char[][] board;
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
            //For x winner
            if (line == 'x' + 'x' + 'x') 
            {
                result = "Player 1 wins!";
                System.out.println(result);
                break;
            }
            
              
            // For o winner
            else if (line == 'o' + 'o' + 'o') 
            {
                result = "Player 2 wins!";
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
}
