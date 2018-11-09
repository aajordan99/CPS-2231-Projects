public class TestPerson2
{
 public static void main (String[] args)
 {
 Person it = new instructor("Mary", 1990, 70000);
 System.out.println(it.toString());
 Person it2 = new instructor("John", 1987, 75000);
 System.out.println(it2.toString());
 Person s1 = new student("Kate", 2001, "CS");
 System.out.println(s1.toString());
 Person p1 = new Person ("James", 2003);
 System.out.println(p1.toString());
 }
}