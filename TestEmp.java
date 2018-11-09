import java.util.*;
import java.util.Scanner;
public class TestEmp {
	public static void main(String [] args) {
		Scanner reader = new Scanner(System.in);
//		Employee employee1 = new Employee("John", "Smith", "310 Kawameeh Lane", 3000000);
//		System.out.println(employee1.getFName());
//		System.out.println(employee1.getLName());
//		System.out.println(employee1.salary());
//		System.out.println(employee1.getAddress());
//		System.out.println(employee1.getDate());
//		System.out.println(employee1.getEmpId());
//		
//		Employee emp2 = new Employee();
//		System.out.println(emp2.getEmpId());
//		System.out.println(employee1);
//
//		System.out.println(emp2);
		Employee [] eX = new Employee[1];
		for (int i = 0; i < eX.length; i++) {
			System.out.println("Enter employee's first name");
			String fName = reader.next();	
			System.out.println("Enter employee's last name");
			String lName = reader.next();
			
			System.out.println("Enter employee's addy");
			String add = reader.nextLine();
			System.out.println("Enter employee's salary");
			double salary = reader.nextDouble();
			reader.nextLine();
			Employee e = new Employee(fName, lName, add, salary);
			eX[i] = e;
			}
		
		for (int i = 0; i < eX.length; i++) {
			System.out.println(eX[i]);
		}
	}
}

/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version 1
 */

class Employee
{
    // instance variables - replace the example below with your own
    private String fName;
    private String lName;
    private String address;
    private double salary;
    private Date dateCreated;
    private int empId;
    private static int empSeq = 1;
    /**
     * Constructor for objects of class Employee
     * @param salary2 
     * @param lName2 
     * @param fName2 
     */
    public Employee(String fName, String lName, double salary)
    {
        // initialise instance variables
        fName = "";
        lName = "";
        address = "";
        salary = 0.0;
        dateCreated = new Date();
        empId = empSeq;
        empSeq++;
    }

    public Employee (String first, String last, String add, double sal){
        fName = first;
        lName = last;
        salary = sal;
        address = add;
        dateCreated = new Date();
        empId = empSeq;
        empSeq++;

    }
    //aCCESSORS OR getters
    
    public String getFName(){
     return fName;   
    }
    
    public int getEmpId() {
    	return empId;
    }
    
    public String getLName(){
     return lName;   
    }
    
    public String getAddress(){
        return address;
    }
    
    public double salary(){
        return salary;
    }
    
    public Date getDate() {
    	return dateCreated;
    }
    //mutators or setter methods
    
    public void setFName(String fName){
        this.fName = fName;
    }
    
    public void setLName(String lName){
     this.lName = lName;   
    }
    
    public void getAddress(String address){
         this.address = address;
    }
    
    public void setSalary(double salary){
     this.salary = salary;   
    }
    
    public String toString() {
    	return  fName + " " + lName + " " + salary + " " + empId + " " + dateCreated;
    	
    }
 
}

