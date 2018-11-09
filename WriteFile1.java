import java.io.*;
import java.util.*;
public class WriteFile1 {
	public static void main (String [] args)throws IOException
	{
		Scanner reader = new Scanner(System.in);
		File file = new File ("students.txt");
		PrintWriter output = new PrintWriter(file);

		for (int i = 0; i < 4; i++)
		{
			System.out.println("Enter a student name");
			String s = reader.nextLine();
			output.println(s);
		}
		reader.close();
		output.close();
	} 

}
