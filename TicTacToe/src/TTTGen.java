import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class TTTGen {
	
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter("output.txt");
		for (int i1 = 0; i1 < 9; i1++)
		{
			writer.print("if(reader.nextInt() == "+i1+"); \n {\n");
			for (int i2 = 1; i2 < 9; i2++)
		{
			writer.print("if(reader.nextInt() == "+i2+"); \n {\n");
			for (int i3 = 2; i3 < 9; i3++)
		{
			writer.print("if(reader.nextInt() == "+i3+"); \n {\n");
			for (int i4 = 3; i4 < 9; i4++)
		{
			writer.print("if(reader.nextInt() == "+i4+"); \n {\n");
			for (int i5 = 4; i5 < 9; i5++)
		{
			writer.print("if(reader.nextInt() == "+i5+"); \n {\n");
			for (int i6 = 5; i6 < 9; i6++)
		{
			writer.print("if(reader.nextInt() == "+i6+"); \n {\n");
			for (int i7 = 6; i7 < 9; i7++)
		{
			writer.print("if(reader.nextInt() == "+i7+"); \n {\n");
			for (int i8 = 7; i8 < 9; i8++)
		{
			writer.print("if(reader.nextInt() == "+i8+"); \n {\n");
			for (int i9 = 8; i9 < 9; i9++)
		{
			writer.println("if(reader.nextInt() == "+i9+"); \n {");
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
}