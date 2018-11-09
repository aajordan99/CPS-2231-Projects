public class TestPoly
{
    public static void main (String[] args)       
    {
        instructor it = new instructor("Mary", 1990, 70000);
        
        student s1 = new student("Charlie", 1982, "CS");
        
        //Pass a reference of type instructor to printPerson
        printPerson(it);
        //Pass a reference of type student to printPerson
        printPerson(s1);   
        
        }
    
    //Reference of type Person as parameter
    public static void printPerson (Person p)         
    {
        System.out.println("Name " + p.getName() + " Birthdate: " + 
                                p.getBirthYear() );  
        
        if (p instanceof student)
        System.out.println( ((student)p).getMajor());
        else
        System.out.println( ((instructor)p).getSalary());
    }
}