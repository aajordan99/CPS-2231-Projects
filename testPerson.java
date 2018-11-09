public class testPerson {
	public static void main(String[] args){
		instructor it = new instructor("Mary", 1990, 70000);
		instructor it2 = new instructor("John", 1987, 75000);
		student s1 = new student("Kate", 2001, "CS");
		
		printPerson(it);
		printPerson(it2);
		printPerson(s1);
	}
	
	public static void printPerson(Person p1) {
		System.out.println(p1);
	}
	
}