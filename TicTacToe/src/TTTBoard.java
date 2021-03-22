
public class TTTBoard {
	private char[][] board;
	
	public TTTBoard() {
		board = new char[3][3];
		reset();
	}
	
	public void reset() {
		for (int row = 0; row < 3; row++)
		{
			for(int column = 0; column < 3; column++)
			{
				board[row][column] = '-';
			}
		}
	}
	
	public String toString() {
		String result = "\n";
		for (int row = 0; row < 3; row++)
		{
			for(int column = 0; column < 3; column++)
			{
				result += board[row][column] + " ";
			}
			result += "\n";
		}
		return result;
	}
	
	public boolean placeXorO(char player, int row, int column) {
		if (board[row - 1][column - 1] == '-') 
		{
			board[row - 1][column - 1] = player;
			return true;
		} else
		{
			return false;
		}
	}
}
