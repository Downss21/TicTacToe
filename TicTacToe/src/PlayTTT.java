import java.util.Scanner;
import java.util.Random;

public class PlayTTT
{
  public static void main(String[] args)
  {
    Scanner reader = new Scanner(System.in);
    TTTBoard board = new TTTBoard();

    System.out.println(board);

    Random gen = new Random();
    char player;
    if(gen.nextInt(2) == 1)
    {
      player = 'O';
    }
    else
    {
      player = 'X';
    }

    while(board.getWinner() == '-' && !board.full())
    {
      System.out.println(player + "'s turn");
      System.out.println("Enter the row and column[1-3, space, 1-3]: ");

      int row = reader.nextInt();
      int col = reader.nextInt();

      //Check input
      if(row < 1 || row > 3 || col < 1 || col > 3)
      {
        System.out.println("Enter numbers between 1 and 3 separated by a space!");
        continue;  //restart loop
      }

      boolean success = board.placeXorO(player,row,col);
      if(!success)
      {
        System.out.println("Error: cell already occupied!");
      }
      else
      {
        System.out.println(board);
        if(player == 'X')
        {
          player = 'O';
        }
        else
        {
          player = 'X';
        }


      }

    }

    char winner = board.getWinner();
    if(winner != '-')
    {
      System.out.println(winner + "'s win!");
    }
    else
    {
      System.out.println("It's a draw!");
    }


  }
}