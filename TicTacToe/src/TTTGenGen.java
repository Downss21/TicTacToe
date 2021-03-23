import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class TTTGenGen {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter("GeneratedGenerator.java");
		char[] players = {'X','O'};
		
		writer.println("import java.io.PrintWriter;");
		writer.println("import java.io.FileNotFoundException;");
		writer.println("import java.util.Arrays;");
		
		writer.println("public class GeneratedGenerator {");
		writer.println("public static void main(String[] args) throws FileNotFoundException {");
		writer.println("PrintWriter writer = new PrintWriter(\"TicTacToe.java\");");
		writer.println("char[] board = {' ',' ',' ',' ',' ',' ',' ',' ',' '};");
		for(int i = 0; i < 9; i++)
		{
			writer.print("for (int i"+i+" = "+i+"; i"+i+" < 9; i"+i+"++) {"
					+ "char[] board"+i+" = Arrays.copyOf(board"+(i - 1)+", 9);\r\n"
					+ "			printBoard(writer, board"+i+");\r\n"
					+ "			writer.println(\"System.out.print(\\\"Enter the space you want to play on "+players[i%2]+": \\\");\");\r\n"
					+ "			printSelection(writer);\r\n"
					+ "			writer.println(\"int input = reader.nextInt();\");\r\n"
					+ "			board"+i+"[i"+i+"] = '"+players[i%2]+"';\r\n"
					+ "			if(isWon(i"+i+", board"+i+"))\r\n"
					+ "			{\r\n"
					+ "				writer.println(\"System.out.print(\\\""+players[i%2]+" Won!\\\");\");\r\n"
					+ "				continue;\r\n"
					+ "			}\r\n"
					+ "			writer.println(\"if(input == \"+i"+i+"+\"); \\n {\");");
		}
		writer.print("}}}}}}}}}}");
		writer.println("public static void printBoard(PrintWriter writer, char[] board)\r\n"
				+ "	{\r\n"
				+ "		writer.println(\"System.out.println(\\\" \"+board[0]+\" | \"+board[1]+\" | \"+board[2]+\" \\\\n―――+―――+―――\\\\n \"+board[3]+\" | \"+board[4]+\" | \"+board[5]+\" \\\\n―――+―――+―――\\\\n \"+board[6]+\" | \"+board[7]+\" | \"+board[8]+\" \\\");\");\r\n"
				+ "	}\r\n"
				+ "	\r\n"
				+ "	public static void printSelection(PrintWriter writer)\r\n"
				+ "	{\r\n"
				+ "		writer.println(\"System.out.println(\\\" \"+0+\" | \"+1+\" | \"+2+\" \\\\n―――+―――+―――\\\\n \"+3+\" | \"+4+\" | \"+5+\" \\\\n―――+―――+―――\\\\n \"+6+\" | \"+7+\" | \"+8+\" \\\");\");\r\n"
				+ "	}\r\n"
				+ "	public static boolean isWon(int last, char[] board) {\r\n"
				+ "		char player = board[last];\r\n"
				+ "		//hardcoded is bestcoded\r\n"
				+ "		if (last == 0)\r\n"
				+ "		{\r\n"
				+ "			return (board[1] == player && board[2] == player) || (board[3] == player && board[6] == player) || (board[4] == player && board[8] == player);\r\n"
				+ "		} else\r\n"
				+ "		{ if (last == 1)\r\n"
				+ "		{\r\n"
				+ "			return (board[0] == player && board[2] == player) || (board[4] == player && board[7] == player);\r\n"
				+ "		}  else\r\n"
				+ "		{ if (last == 2)\r\n"
				+ "		{\r\n"
				+ "			return (board[1] == player && board[0] == player) || (board[5] == player && board[8] == player) || (board[4] == player && board[6] == player);\r\n"
				+ "		} else\r\n"
				+ "		{ if (last == 3)\r\n"
				+ "		{\r\n"
				+ "			return (board[0] == player && board[6] == player) || (board[4] == player && board[5] == player);\r\n"
				+ "		} else\r\n"
				+ "		{ if (last == 4)\r\n"
				+ "		{\r\n"
				+ "			return (board[0] == player && board[8] == player) || (board[1] == player && board[7] == player) || (board[2] == player && board[6] == player) || (board[5] == player && board[3] == player);\r\n"
				+ "		} else\r\n"
				+ "		{ if (last == 5)\r\n"
				+ "		{\r\n"
				+ "			return (board[2] == player && board[8] == player) || (board[3] == player && board[4] == player);\r\n"
				+ "		} else\r\n"
				+ "		{ if (last == 6)\r\n"
				+ "		{\r\n"
				+ "			return (board[0] == player && board[3] == player) || (board[4] == player && board[2] == player) || (board[7] == player && board[8] == player);\r\n"
				+ "		} else\r\n"
				+ "		{ if (last == 7)\r\n"
				+ "		{\r\n"
				+ "			return (board[6] == player && board[8] == player) || (board[1] == player && board[4] == player);\r\n"
				+ "		} else\r\n"
				+ "		{ \r\n"
				+ "			return (board[6] == player && board[7] == player) || (board[0] == player && board[5] == player) || (board[2] == player && board[5] == player);\r\n"
				+ "		}}}}}}}}\r\n"
				+ "		\r\n"
				+ "	}}");
		writer.close();
	}

}
