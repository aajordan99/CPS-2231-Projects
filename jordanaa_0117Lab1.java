import java.util.Scanner;
public class jordanaa_0117Lab1 {
	public static void main(String[] args) {
		String fname, lname;
		Scanner names = new Scanner(System.in);
		System.out.println("Enter your first name.");
		fname = names.next();
		System.out.println("Enter your last name.");
		lname = names.next();
		System.out.println("Hello \"" + fname + " " + lname + "\"");
		names.close();
	}
}
