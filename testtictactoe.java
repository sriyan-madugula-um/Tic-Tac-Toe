import java.util.*;
public class testtictactoe
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
    
    static ArrayList<Integer> playerPos = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPos = new ArrayList<Integer>(); 
     public static String checkWinner() {
        //Rows
        List topside = Arrays.asList(1, 2, 3);
        List midside = Arrays.asList(4, 5, 6);
        List botside = Arrays.asList(7, 8, 9);
        //Collumns
        List leftup = Arrays.asList(1, 4, 7);
        List midup = Arrays.asList(2, 5, 8);
        List rightup = Arrays.asList(3, 6, 9);
        //diagonals
        List crossltr = Arrays.asList(1, 5, 9);
        List crossrtl = Arrays.asList(7, 5, 3);
          List<List> winning = new ArrayList<List>();
        //Rows
        winning.add(topside);
        winning.add(midside);
        winning.add(botside);
        //Collumns
        winning.add(leftup);
        winning.add(midup);
        winning.add(rightup);
        //diagonals
        winning.add(crossltr);
        winning.add(crossrtl);
        
        String result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                
            }

                 for (List l : winning) {
            if (playerPos.containsAll(l)) {
                return "Victory";
            } else if (cpuPos.containsAll(l)) {
                return "Loss";
            } else if (playerPos.size() + cpuPos.size() == 9) {
                return "Draw";
            }


}
 return "";
}
}