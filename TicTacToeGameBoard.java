import java.util.*;
public class TicTacToe
{
    public static void main(String[] args)
    {
        System.out.println("Instructions: This is a 2-player Tic Tac Toe Game. Enter a position from 1-9, corresponding left to right and top to bottom.");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Player 1, enter your first name: ");
        String player1 = input.next();
        
        System.out.print("Player 2, enter your first name: ");
        String player2 = input.next();
        
        System.out.print(player1 + ", enter the character that you want for the game: ");
        char player1char = input.next().charAt(0);
        
        System.out.print(player2 + ", enter the character that you want for the game: ");
        char player2char = input.next().charAt(0);

        TicTacToeTester.createPlayer1(player1, player1char);
        TicTacToeTester.createPlayer2(player2, player2char);
        
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
           {'-', '+', '-', '+', '-'},
           {' ', '|', ' ', '|', ' '},
           {'-', '+', '-', '+', '-'},
           {' ', '|', ' ', '|', ' '}};
           
        TicTacToeTester.returnGameBoard(gameBoard);

        System.out.println();
        System.out.println(TicTacToeTester.getPlayer1() + ", enter a number between 1-9 for your position: ");
        System.out.println();
        
        char variable = ' ';
        for (int i = 0; i < 9; i++)
        {
            int position = input.nextInt();
            if (i % 2 == 0)
            {
                variable = player1char;
                System.out.println(TicTacToeTester.getPlayer2() + ", enter your position: ");
                System.out.println();
            }
            if (i % 2 == 1)
            {
                variable = player2char;
                System.out.println(TicTacToeTester.getPlayer1() + ", enter your position: ");
                System.out.println();
            }
            if (position == 1)
            {
                gameBoard[0][0] = variable;
            }
            if (position == 2)
            {
                gameBoard[0][2] = variable;
            }
            if (position == 3)
            {
                gameBoard[0][4] = variable;
            }
            if (position == 4)
            {
                gameBoard[2][0] = variable;
            }
            if (position == 5)
            {
                gameBoard[2][2] = variable;
            }
            if (position == 6)
            {
                gameBoard[2][4] = variable;
            }
            if (position == 7)
            {
                gameBoard[4][0] = variable;
            }
            if (position == 8)
            {
                gameBoard[4][2] = variable;
            }
            if (position == 9)
            {
                gameBoard[4][4] = variable;
            }
            TicTacToeTester.returnGameBoard(gameBoard);
            
            String result = TicTacToeTester.checkWinner(gameBoard);
            if (result.length() > 1)
            {
                break;
            }
            if (i == 8)
            {
                System.out.println("It's a draw!");
            }
        }
        
    }
    
    
}
