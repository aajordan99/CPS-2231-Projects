import java.util.Scanner;
public class jordanaa_TestCourse1 {
	public static void main(String[] args) {
		Scanner school = new Scanner(System.in);
		jordanaa_Course [] classes = new jordanaa_Course[3];
		for (int i = 0; i < classes.length; i++) {
		System.out.println("Enter department");
		String deptCode = school.next();
		System.out.println("Enter room number");
		int rNumbe = school.nextInt();
		System.out.println("Enter course name");
		school.nextLine();
		String cName = school.nextLine();
		jordanaa_Course1 course = new jordanaa_Course1(cName, deptCode, rNumbe);
		classes[i] = course;
		}
		System.out.println("Printing the courses");
		for (int i =0; i < classes.length; i++) {
			System.out.println(classes[i]);
		}
	}

}
