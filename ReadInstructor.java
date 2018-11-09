import java.io.*;
import java.util.Scanner;
public class ReadInstructor {
	public static void main(String[] args) throws IOException {
		File file = new File("instructors.txt");
		Scanner reader = new Scanner(file);
		int year = 0;
		double salary = 0.0;
		String fName = "";
		String lName = "";
		String fullName = "";

		while(reader.hasNext()) {
			fName = reader.next();
			lName = reader.next();
			fullName = fName + " " + lName;
			year = reader.nextInt();
			salary = reader.nextDouble();
			Instructor i1 = new Instructor(fullName, year, salary);
			System.out.println(i1);
		}
		reader.close();
	}
}
