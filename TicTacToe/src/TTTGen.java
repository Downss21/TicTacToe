import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class TTTGen {

	public static void main(String[] args) throws FileNotFoundException {
		//set up related to the actual generator
		PrintWriter writer = new PrintWriter("output.java");
		char[] board = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
		
		//setting up TTT file
		writer.println("import java.util.Scanner;");
		
		writer.println("Scanner reader = new Scanner(System.in);");
		
		//main game nest
		for (int i1 = 0; i1 < 9; i1++)
		{
			char[] board1 = board;
			printBoard(writer, board1);
			writer.println("System.out.print(\"Enter the space you want to play on X: \");");
			printSelection(writer);
			writer.println("int input = reader.nextInt()");
			board1[i1] = 'X';
			writer.println("if(input == "+i1+"); \n {");
			for (int i2 = 1; i2 < 9; i2++)
			{
				char[] board2 = board1;
				printBoard(writer, board2);
				writer.println("System.out.print(\"Enter the space you want to play on O: \");");
				printSelection(writer);
				writer.println("input = reader.nextInt()");
				board1[i2] = 'O';
				writer.println("if(input == "+i2+"); \n {");
				for (int i3 = 2; i3 < 9; i3++)
				{
					char[] board3 = board2;
					printBoard(writer, board3);
					writer.println("System.out.print(\"Enter the space you want to play on X: \");");
					printSelection(writer);
					writer.println("input = reader.nextInt()");
					board1[i3] = 'X';
					writer.println("if(input == "+i3+"); \n {");
					for (int i4 = 3; i4 < 9; i4++)
					{
						char[] board4 = board3;
						printBoard(writer, board4);
						writer.println("System.out.print(\"Enter the space you want to play on O: \");");
						printSelection(writer);
						writer.println("input = reader.nextInt()");
						board1[i4] = 'O';
						writer.println("if(input == "+i4+"); \n {");
						for (int i5 = 4; i5 < 9; i5++)
						{
							char[] board5 = board4;
							printBoard(writer, board5);
							writer.println("System.out.print(\"Enter the space you want to play on X: \");");
							printSelection(writer);
							writer.println("input = reader.nextInt()");
							board1[i5] = 'X';
							writer.println("if(input == "+i5+"); \n {");
							for (int i6 = 5; i6 < 9; i6++)
							{
								char[] board6 = board5;
								printBoard(writer, board6);
								writer.println("System.out.print(\"Enter the space you want to play on O: \");");
								printSelection(writer);
								writer.println("input = reader.nextInt()");
								board1[i6] = 'O';
								writer.println("if(input == "+i6+"); \n {");
								for (int i7 = 6; i7 < 9; i7++)
								{
									char[] board7 = board6;
									printBoard(writer, board7);
									writer.println("System.out.print(\"Enter the space you want to play on X: \");");
									printSelection(writer);
									writer.println("input = reader.nextInt()");
									board1[i7] = 'X';
									writer.println("if(input == "+i7+"); \n {");
									for (int i8 = 7; i8 < 9; i8++)
									{
										char[] board8 = board7;
										printBoard(writer, board8);
										writer.println("System.out.print(\"Enter the space you want to play on O: \");");
										printSelection(writer);
										writer.println("input = reader.nextInt()");
										board1[i8] = 'O';
										writer.println("if(input == "+i8+"); \n {");
										for (int i9 = 8; i9 < 9; i9++)
										{
											char[] board9 = board8;
											printBoard(writer, board9);
											writer.println("System.out.print(\"Enter the space you want to play on X: \");");
											printSelection(writer);
											writer.println("input = reader.nextInt()");
											board1[i9] = 'X';
											writer.println("if(input == "+i9+"); \n {");
											writer.println("System.out.println("+i1+" "+i2+" "+i3+" "+i4+" "+i5+" "+i6+" "+i7+" "+i8+" "+i9+");");
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
		writer.close();
	}
	
	public static void printBoard(PrintWriter writer, char[] board)
	{
		writer.println("System.out.println(\" "+board[0]+" | "+board[1]+" | "+board[2]+" \\n―――+―――+―――\\n "+board[3]+" | "+board[4]+" | "+board[5]+" \\n―――+―――+―――\\n "+board[6]+" | "+board[7]+" | "+board[8]+" \")");
	}
	
	public static void printSelection(PrintWriter writer)
	{
		writer.println("System.out.println(\" "+0+" | "+1+" | "+2+" \\n―――+―――+―――\\n "+3+" | "+4+" | "+5+" \\n―――+―――+―――\\n "+6+" | "+7+" | "+8+" \")");
	}
}