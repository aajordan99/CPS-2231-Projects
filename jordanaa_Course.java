public class jordanaa_Course {
	private String courseName;
	private int numStudents;
	private jordanaa_Student [] students = new jordanaa_Student [10];
	int q = 0;

	public jordanaa_Course(String courseName) {
		numStudents = 0;
		this.courseName = courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	public String getStudent() {
		int i = 0;
		return students[i].toString();
	}
	public int getNumStudents() {
		return numStudents;
	}
	public void addStudent(jordanaa_Student student) {
		students[q] = student;
		numStudents++;
	} 
	public void addStudent(String studentName) {
		students[q] = new jordanaa_Student(studentName);
		q++;
		numStudents++;
	}
	public String toString() {
		String temp = "";
		for (int x = 0; x < students.length; x++) {
			if (students[x] != null) {
				temp += students[x].toString() + "\n";
			}
		}
		return  "Course Name: " + courseName + " Number of Students: " + (numStudents) + 
				"\nThe Students in the class are: \n" + temp;
	}
}