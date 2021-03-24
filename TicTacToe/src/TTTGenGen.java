import java.io.FileNotFoundException;
import java.io.PrintWriter;

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
		
		writer.println("writer.println(\"import java.util.Scanner;\");\r\n"
				+ "		\r\n"
				+ "		writer.println(\"public class TicTacToe {\");\r\n"
				+ "		writer.println(\"public static void main(String[] args) {\");\r\n"
				+ "		writer.println(\"Scanner reader = new Scanner(System.in);\");");
		
		writer.println("char[] board = {' ',' ',' ',' ',' ',' ',' ',' ',' '};");
		writer.println("			printSelection(writer);"
				+ "			writer.println(\"System.out.print(\\\"Enter the space you want to play on X: \\\");\");\r\n"
				+ "			writer.println(\"int input = reader.nextInt();\");\r\n");
		writer.println("for (int i0 = 0; i0 < 9; i0++) {");
		writer.println("char[] board0 = Arrays.copyOf(board, 9);\r\n"
				+ "			board0[i0] = 'X';\r\n");
		writer.println("writer.println(\"if(input == \"+i0+\"); \\n {\");");
				
		for(int i = 1; i < 9; i++)
		{
			writer.println("for (int i"+i+" = 0; i"+i+" < 9; i"+i+"++) {");
			writer.println("if (");
			for (int j = 0; j < i; j++)
			{
				writer.print("i"+i+" == i"+j);
				if (j != i - 1)
				{
					writer.print(" || ");
				}
			}
			writer.println(")\n{\n continue;\n}");
			writer.println("writer.println(\"if(input == \"+i"+i+"+\"); \\n {\");");
			
			/*
			writer.print("writer.println(");
			for (int j = 0; j <= i; j++)
			{
				writer.print("Integer.toString(i"+j+")");
				if (j != i)
				{
					writer.print(" + ");
				}
			}
			writer.println(");");
			*/
			if (i != 8) {
			writer.println("if(isWon(i"+(i - 1)+", board"+(i - 1)+"))\r\n"
					+ "			{"
					+ "				writer.println(\"System.out.print(\\\""+players[(i - 1)%2]+" Won!\\\");\");\r\n"
					+ "             writer.println(\"System.exit(0);\");\r\n"
					+ "             writer.println(\"}\");\n"
					+ "				continue;\r\n"
					+ "			}\r\n"
					+ "char[] board"+i+" = Arrays.copyOf(board"+(i - 1)+", 9);\r\n"
					+ "			printBoard(writer, board"+i+");\r\n"
					+ "			writer.println(\"System.out.print(\\\"Enter the space you want to play on "+players[i%2]+": \\\");\");\r\n"
					+ "			writer.println(\"input = reader.nextInt();\");\r\n"
					+ "			board"+i+"[i"+i+"] = '"+players[i%2]+"';\r\n");
			}
			else {
				writer.println("if(isWon(i"+(i - 1)+", board"+(i - 1)+"))\r\n"
						+ "			{"
						+ "				writer.println(\"System.out.print(\\\""+players[(i - 1)%2]+" Won!\\\");\");\r\n"
						+ "             writer.println(\"System.exit(0);\");\r\n"
						+ "             writer.println(\"}\");\n"
						+ "				continue;\r\n"
						+ "			}\r\n"
						+ "else {\n"
						+ "writer.println(\"System.out.println(\\\"It's a Tie!\\\");\\n System.exit(0);\\n\");\n"
						+ "}"
						);
			}
					
		}
		//closing things
		for (int i = 0; i < 9; i++)
		{
			writer.println("writer.println(\"}\");");
			writer.println("}");
		}
		writer.println("writer.println(\"}}\");");
		
		writer.println("writer.close();\n}");
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
