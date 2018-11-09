import java.util.Scanner;
public class jordanaa_TestCourse {
	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);
		String x;
		int count = 0;
		System.out.println("Enter name of Course ");
		x = test.nextLine();
		jordanaa_Course j = new jordanaa_Course(x);
		System.out.println("Enter student name, q to quit.");
		String nxt = test.nextLine();
		j.addStudent(nxt);
		while (!nxt.equalsIgnoreCase("Q") && count < 9) {
			System.out.println("Enter student name, q to quit.");
			nxt = test.nextLine();
			if (!nxt.equalsIgnoreCase("Q")){
				j.addStudent(nxt);
			}
			count++;
		}
		test.close();
		System.out.println(j);
	}
}
