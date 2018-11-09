
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version 1
 */
import java.util.*;
public class Employee
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
