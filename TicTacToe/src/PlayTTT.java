
// Example 12.3
import java.util.Random;
import java.util.Scanner;

public class PlayTTT {
	static TTTBoard board = new TTTBoard();
	public static void main(String[] args) { // Instantiate a keyboard scanner and a board
		Scanner reader = new Scanner(System.in);
		
		// Display the empty board
		System.out.println(board);
		// Randomly decide who goes first
		Random gen = new Random();
		char player;
		if (gen.nextInt(2) == 1)
		{
			player = 'O';
		}
		else
		{
			player = 'X';
		}
		// Loop while there is no winner and the board is not full
		while (board.getWinner() == '-' && !board.full())
		{
			int row;
			int column;
			if (player == 'X')
			{
			// Prompt the user for a move
			System.out.println(player + "'s turn");
			System.out.print("Enter the row and column[1-3, space, 1-3]: ");
			// Read the move
			row = reader.nextInt();
			column = reader.nextInt();
			}
			else
			{
				int play = computerPlay(true);
				row = (play%3) + 1;
				column = (play / 3) + 1;
			}
			boolean success = board.placeXorO(player, row, column);
			if (!success)
			{
				System.out.println("Error: cell already occupied!");
			}
			else
			{
				/*
				 * Attempt the move If the move is illegal display an error message Else display
				 * the board and switch players
				 */
				System.out.println(board);
				if (player == 'X')
				{
					player = 'O';
				}
				else
				{
					player = 'X';
				}
			}
		}
				// Display results
				char winner = board.getWinner();
				if (winner != '-')
				{
					System.out.println(winner + "s win!");
				}
				else
				{
					System.out.println("It's a draw!");
				}
			}

	private static int computerPlay(boolean smart) {
		if (smart)
		{
			//code concept stolen from asweigart on github
			//first checks for 1 move wins it can do. then 1 move wins the human can do, returns the first square it finds that would win for either of them
			char players[] = {'O','X'};
			for (int i = 0; i < 2; i++)
			{
				char player = players[i%2];
				for (int j = 0; j < 9; j++)
				{
					TTTBoard copy = board.clone();
					int row = j%3;
					int column = j / 3;
					copy.coolPlaceXorO(player, row, column);
					if(copy.getWinner() != '-')
					{
						return j;
					}
				}
			}
			return computerPlay(false);
		}
		else
		{
			boolean canPlay = false;
			int play = -1;
			while (!canPlay)
			{
				play = (int)(9 * Math.random());
				int row = play%3;
				int column = play / 3;
				canPlay = board.canPlace(row, column);
			}
			return play;
		}
	}
}