public class TTTBoard {
	// Holds values of each square, 3x3 array
	private char[][] board;

	public TTTBoard() {
		board = new char[3][3];
		reset();
	}

	public void reset() {
		for (int row = 0; row < 3; row++)
		{
			for (int col = 0; col < 3; col++)
			{
				board[row][col] = '-';
			}
		}
	}

	public String toString() {
		String result = "\n";
		for (int row = 0; row < 3; row++)
		{
			for (int col = 0; col < 3; col++)
			{
				result = result + board[row][col];
			}
			result = result + "\n";
		}
		return result;
	}

	public boolean placeXorO(char player, int row, int col) {
		if (board[row - 1][col - 1] == '-')
		{
			board[row - 1][col - 1] = player;
			return true;
		}
		else
		{
			return false;
		}
	}

	public char getWinner() {
		String lines[] = new String[8];
		for (int i = 0; i < board.length; i++)
		{
			String lineH = "";
			String lineV = "";
			for (int j = 0; j < board[i].length; j++)
			{
				lineH += board[i][j];
				lineV += board[j][i];
			}
			lines[2 * i] = lineH;
			lines[(2 * i + 1)] = lineV;
		}
		lines[6] = Character.toString(board[0][0]) + board[1][1] + board[2][2];
		lines[7] = Character.toString(board[0][2]) + board[1][1] + board[3][0];

		for (int i = 0; i < lines.length; i++)
		{
			if (lines[i].equals("XXX"))
			{
				return 'X';
			}
			else
			{
				if (lines[i].equals("OOO"))
				{
					return 'O';
				}
			}
		}
		return '-';
	}

	public boolean full() {
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[i].length; j++)
			{
				if (board[i][j] == '-')
				{
					return false;
				}
			}
		}
		return true;
	}

}