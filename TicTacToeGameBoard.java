import java.util.*;
public class TicTacToeGameBoard
{
    public static void main(String[] args)
    {
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
           {'-', '+', '-', '+', '-'},
           {' ', '|', ' ', '|', ' '},
           {'-', '+', '-', '+', '-'},
           {' ', '|', ' ', '|', ' '}};
           
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

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1-9 for your position");
        
        char variable = ' ';
        for (int i = 0; i < 10 /*need to make a variable for this*/; i++)
        {
            int position = input.nextInt();
            if (i % 2 == 0)
            {
                variable = 'o';
            }
            if (i % 2 == 1)
            {
                variable = 'x';
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
            for(int j = 0; j < 5; j++)
            {
                char[] row = gameBoard[j];
                    for(int k = 0; k < 5; k++)
                    {
                        char c = row[k];
                        System.out.print(c);
                    }
                System.out.println();
            }
        }
        
        

    }
    
}
