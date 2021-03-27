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
		writer.println("int counter = 0;");
		
		writer.println("writer.println(\"import java.util.Scanner;\");\r\n"
				+ "		\r\n"
				+ "		writer.println(\"public class TicTacToe {\");\r\n"
				+ "		writer.println(\"Scanner reader = new Scanner(System.in);\");\n"
				+ "		writer.println(\"int input;\");");
		
		writer.println("char[] board = {' ',' ',' ',' ',' ',' ',' ',' ',' '};");
		writer.println("String methodName = \"method\";");
		/*
		writer.println("			printSelection(writer);"
				+ "			writer.println(\"System.out.print(\\\"Enter the space you want to play on X: \\\");\");\r\n"
				+ "			writer.println(\"int input = reader.nextInt();\");\r\n");
		writer.println("for (int i0 = 0; i0 < 9; i0++) {");
		writer.println("char[] board0 = Arrays.copyOf(board, 9);\r\n"
				+ "			board0[i0] = 'X';\r\n");
		writer.println("writer.println(\"if(input == \"+i0+\"); \\n {\");");
		*/
				
		for(int i = 0; i < 9; i++)
		{
			writer.println("for (int i"+i+" = 0; i"+i+" < 9; i"+i+"++) {");
			String invalid = "if (";
			for (int j = 0; j < i; j++)
			{
				invalid += "i"+i+" == i"+j;
				if (j != i - 1)
				{
					invalid += " || ";
				}
			}
			invalid += ")\n{\ncontinue;\n}";
			writer.println(invalid);
			String metaMethod = "methodName"+i;
			writer.println("String "+metaMethod+" = methodName"+(i -1)+" + i"+i+";");
			
			writer.println("counter++;");
			writer.println("writer.println(\"void \"+"+metaMethod+"+\"() {\\ninput = reader.nextInt();\");");
			
			
			String invalid2 = "if (";
			for (int j = 0; j <= i; j++)
			{
				invalid2 += "i == i"+j;
				if (j != i)
				{
					invalid2 += " || ";
				}
			}
			invalid2 += ")\n{\ncontinue;\n}";
			
			writer.println("for (int i = 0; i < 9; i++)\n {\n"
					+ invalid2
					+ "writer.println(\"if (input == \"+i+\")\\n{\\n"
							+ "\"+"+metaMethod+"+i+\"();\\n"
							+ "}\\n"
							+ "\");\n}\n");
			writer.println("writer.println(\"}\");");
					
		}
		//closing things
		for (int i = 0; i < 9; i++)
		{
			//writer.println("writer.println(\"}\");");
			writer.println("}");
		}
		writer.println("System.out.println(counter);");
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
