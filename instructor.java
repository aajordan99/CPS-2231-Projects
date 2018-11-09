
public class instructor extends Person
{
  private double salary;
    
    public instructor(){
        //super has to be first line of constructor or no compile.
        super();
        salary = 0.0;
    }
       
    public instructor (String name, int birthYear, double salary){
        super(name, birthYear);
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    
    @Override
    public String toString() {
    	return super.toString() + " Salary: " + salary;
    }
}
