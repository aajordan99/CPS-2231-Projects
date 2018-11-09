public class Person{
    private String name;
    private int birthYear;
    public Person(){
        name = "";
        birthYear = 0;
        
    }
   public Person(String name, int birthYear){
       this.name=name;
       this.birthYear=birthYear;
    }
    public String getName(){
        return this.name;
    }
    public int getBirthYear(){
        return this.birthYear;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBirthYear(int birthYear){
        this.birthYear=birthYear;
    }  
    @Override
    public String toString () {
    	return "Name: " + name + " Birth Year: " + birthYear;
    }
    
    public static void main (String[] args) {
    	
    	Person p1 = new Person ("John", 1980);
    	System.out.println(p1.getName() + p1.getBirthYear());
    }
    
}
