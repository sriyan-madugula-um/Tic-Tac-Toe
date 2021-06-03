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
    }
}