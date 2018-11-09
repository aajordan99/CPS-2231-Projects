import java.io.File;
import java.io.*;
import java.util.Scanner;

public class readInput {
	public static void main (String [] args)throws IOException {
		File file = new File ("names.txt");
		Scanner reader = new Scanner(file);
		while (reader.hasNext())
		{
		String name = reader.nextLine();
		System.out.println(name);
		}
		reader.close();
		}
		
}
