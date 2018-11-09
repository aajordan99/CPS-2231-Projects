public class Instructor
{
    private String name;
    private int birthYear;
    private double salary;
    
    public Instructor()
    {
        name = "";
        birthYear = 0;  
        salary = 0;
    }
    public Instructor (String newName, int bYear, double sal)
    {
        name = newName;
        birthYear = bYear; 
        salary = sal;
    }
    public String getName()
    {
     return name;   
    }
    
    public int getBirthYear()
    {
     return birthYear;   
    }
    public void setName(String newName)
    {
     name = newName;   
    }
    public void setBirthYeaR(int bYear)
    {
     birthYear = bYear;   
    } 
    public double getSalary()
    {
    	return salary;
    }
    public void setSalary (double newSal)
    {
    	salary = newSal;
    }
    public String toString()
    {
    	return "Name: " + name + " BirthYear: " + birthYear + " Salary: " + salary;
    
    }
   
    
}
