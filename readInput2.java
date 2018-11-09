import java.util.Scanner;
import java.io.*;
public class readInput2 {
	public static void main(String[] args) throws IOException{
		File file = new File("scores.txt");
		Scanner reader = new Scanner(file);
		int score = 0;
		String name = "";
		while(reader.hasNext()) {
			name = reader.next();
			System.out.print(name + " ");
			name = reader.next();
			System.out.print(name + " ");
			name = reader.next();
			System.out.print(name + " ");
			score = reader.nextInt();
			System.out.println(score);
		}
		
		
	}
}
