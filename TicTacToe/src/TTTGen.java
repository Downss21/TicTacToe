import java.io.PrintWriter;
import java.util.Arrays;
import java.io.FileNotFoundException;

public class TTTGen {

	public static void main(String[] args) throws FileNotFoundException {
		//set up related to the actual generator
		PrintWriter writer = new PrintWriter("TicTacToe.java");
		char[] board = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
		
		//setting up TTT file
		writer.println("import java.util.Scanner;");
		
		writer.println("public class TicTacToe {");
		writer.println("static Scanner reader = new Scanner(System.in);");
		writer.println("static int input;");
		
		//main game nest
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 9; j++)
			{
				
			}
		}
		writer.print("}\n}");
		writer.close();
	}
	
	public static void printBoard(PrintWriter writer, char[] board)
	{
		writer.println("System.out.println(\" "+board[0]+" | "+board[1]+" | "+board[2]+" \\n―――+―――+―――\\n "+board[3]+" | "+board[4]+" | "+board[5]+" \\n―――+―――+―――\\n "+board[6]+" | "+board[7]+" | "+board[8]+" \");");
	}
	
	public static void printSelection(PrintWriter writer)
	{
		writer.println("System.out.println(\" "+0+" | "+1+" | "+2+" \\n―――+―――+―――\\n "+3+" | "+4+" | "+5+" \\n―――+―――+―――\\n "+6+" | "+7+" | "+8+" \");");
	}
	public static boolean isWon(int last, char[] board) {
		char player = board[last];
		//hardcoded is bestcoded
		if (last == 0)
		{
			return (board[1] == player && board[2] == player) || (board[3] == player && board[6] == player) || (board[4] == player && board[8] == player);
		} else
		{ if (last == 1)
		{
			return (board[0] == player && board[2] == player) || (board[4] == player && board[7] == player);
		}  else
		{ if (last == 2)
		{
			return (board[1] == player && board[0] == player) || (board[5] == player && board[8] == player) || (board[4] == player && board[6] == player);
		} else
		{ if (last == 3)
		{
			return (board[0] == player && board[6] == player) || (board[4] == player && board[5] == player);
		} else
		{ if (last == 4)
		{
			return (board[0] == player && board[8] == player) || (board[1] == player && board[7] == player) || (board[2] == player && board[6] == player) || (board[5] == player && board[3] == player);
		} else
		{ if (last == 5)
		{
			return (board[2] == player && board[8] == player) || (board[3] == player && board[4] == player);
		} else
		{ if (last == 6)
		{
			return (board[0] == player && board[3] == player) || (board[4] == player && board[2] == player) || (board[7] == player && board[8] == player);
		} else
		{ if (last == 7)
		{
			return (board[6] == player && board[8] == player) || (board[1] == player && board[4] == player);
		} else
		{ 
			return (board[6] == player && board[7] == player) || (board[0] == player && board[5] == player) || (board[2] == player && board[5] == player);
		}}}}}}}}
		
	}
}