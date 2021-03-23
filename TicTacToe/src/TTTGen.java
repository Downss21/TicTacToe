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
		writer.println("public static void main(String[] args) {");
		writer.println("Scanner reader = new Scanner(System.in);");
		
		//main game nest
		for (int i1 = 0; i1 < 9; i1++)
		{
			char[] board1 = Arrays.copyOf(board, 9);
			printBoard(writer, board1);
			writer.println("System.out.print(\"Enter the space you want to play on X: \");");
			printSelection(writer);
			writer.println("int input = reader.nextInt();");
			board1[i1] = 'X';
			if(isWon(i1, board1))
			{
				writer.println("System.out.print(\"X Won!\");");
				continue;
			}
			writer.println("if(input == "+i1+"); \n {");
			for (int i2 = 1; i2 < 9; i2++)
			{
				char[] board2 = Arrays.copyOf(board1, 9);
				printBoard(writer, board2);
				writer.println("System.out.print(\"Enter the space you want to play on O: \");");
				printSelection(writer);
				writer.println("input = reader.nextInt();");
				board2[i2] = 'O';
				if(isWon(i2, board2))
				{
					writer.println("System.out.print(\"O Won!\");");
					continue;
				}
				writer.println("if(input == "+i2+"); \n {");
				for (int i3 = 2; i3 < 9; i3++)
				{
					char[] board3 = Arrays.copyOf(board2, 9);
					printBoard(writer, board3);
					writer.println("System.out.print(\"Enter the space you want to play on X: \");");
					printSelection(writer);
					writer.println("input = reader.nextInt();");
					board3[i3] = 'X';
					if(isWon(i3, board3))
					{
						writer.println("System.out.print(\"X Won!\");");
						continue;
					}
					writer.println("if(input == "+i3+"); \n {");
					for (int i4 = 3; i4 < 9; i4++)
					{
						char[] board4 = Arrays.copyOf(board3, 9);
						printBoard(writer, board4);
						writer.println("System.out.print(\"Enter the space you want to play on O: \");");
						printSelection(writer);
						writer.println("input = reader.nextInt();");
						board4[i4] = 'O';
						if(isWon(i4, board4))
						{
							writer.println("System.out.print(\"O Won!\");");
							continue;
						}
						writer.println("if(input == "+i4+"); \n {");
						for (int i5 = 4; i5 < 9; i5++)
						{
							char[] board5 = Arrays.copyOf(board4, 9);
							printBoard(writer, board5);
							writer.println("System.out.print(\"Enter the space you want to play on X: \");");
							printSelection(writer);
							writer.println("input = reader.nextInt();");
							board5[i5] = 'X';
							if(isWon(i5, board5))
							{
								writer.println("System.out.print(\"X Won!\");");
								continue;
							}
							writer.println("if(input == "+i5+"); \n {");
							for (int i6 = 5; i6 < 9; i6++)
							{
								char[] board6 = Arrays.copyOf(board5, 9);
								printBoard(writer, board6);
								writer.println("System.out.print(\"Enter the space you want to play on O: \");");
								printSelection(writer);
								writer.println("input = reader.nextInt();");
								board6[i6] = 'O';
								if(isWon(i6, board6))
								{
									writer.println("System.out.print(\"O Won!\");");
									continue;
								}
								writer.println("if(input == "+i6+"); \n {");
								for (int i7 = 6; i7 < 9; i7++)
								{
									char[] board7 = Arrays.copyOf(board6, 9);
									printBoard(writer, board7);
									writer.println("System.out.print(\"Enter the space you want to play on X: \");");
									printSelection(writer);
									writer.println("input = reader.nextInt();");
									board7[i7] = 'X';
									if(isWon(i7, board7))
									{
										writer.println("System.out.print(\"X Won!\");");
										continue;
									}
									writer.println("if(input == "+i7+"); \n {");
									for (int i8 = 7; i8 < 9; i8++)
									{
										char[] board8 = Arrays.copyOf(board7, 9);
										printBoard(writer, board8);
										writer.println("System.out.print(\"Enter the space you want to play on O: \");");
										printSelection(writer);
										writer.println("input = reader.nextInt();");
										board8[i8] = 'O';
										if(isWon(i8, board8))
										{
											writer.println("System.out.print(\"O Won!\");");
											continue;
										}
										writer.println("if(input == "+i8+"); \n {");
										for (int i9 = 8; i9 < 9; i9++)
										{
											char[] board9 = Arrays.copyOf(board8, 9);
											printBoard(writer, board9);
											writer.println("System.out.print(\"Enter the space you want to play on X: \");");
											printSelection(writer);
											writer.println("input = reader.nextInt();");
											board9[i9] = 'X';
											if(isWon(i9, board9))
											{
												writer.println("System.out.print(\"X Won!\");");
												continue;
											}
											writer.println("if(input == "+i9+"); \n {");
											//writer.println("System.out.println("+i1+" "+i2+" "+i3+" "+i4+" "+i5+" "+i6+" "+i7+" "+i8+" "+i9+");");
											writer.println("}");
										}
										writer.println("}");
									}
									writer.println("}");
								}
								writer.println("}");
							}
							writer.println("}");
						}
						writer.println("}");
					}
					writer.println("}");
				}
				writer.println("}");
			}
			writer.println("}");
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