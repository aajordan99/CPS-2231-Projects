import java.io.*;
import java.util.*;
public class ReadPerson99 {
	public static void main (String [] args)throws IOException       {
		File file = new File ("person.txt");
		Scanner reader = new Scanner(file);
		
		Person [] people = new Person[4];  
		//Array of Person.An instructor is-a Person
		//A student is a Person
		
		int numPeople = 0;      //used as the index to the array
		int year = 0;
		double salary = 0.0;
		String major = "";
		String name = "";
		
		//Keep reading file while there is more data
		while (reader.hasNext())
		{
			name=reader.next()+ " ";        //first name
			name= name + reader.next();     //last name
			year = reader.nextInt();        //birth year
			if (reader.hasNextDouble())     
				//Is this a salary field? 
			{
				//Yes - get the salary, create an instructor and 
				//store in array of Person
				salary = reader.nextDouble();
				instructor it = new instructor (name, year, salary);
				people[numPeople] = it;     //store instructor in array of Person
				numPeople++;                //add 1 to index
			}
			else 
				//if the 4th field does not contain a salary, 
				//it is the major
			{    
				//Create a student object and store it in the Array
				major = reader.next();
				student s = new student(name, year, major);
				people[numPeople] = s;  //store student in array of Person
				numPeople++;            //add 1 to index
			}		
		}
		reader.close();  
		
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i]); }
		java.util.Arrays.sort(people);
		System.out.println("After sorting");
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i]); }
		
		
		
		
//		double sum = 0.0;
//		for (int i = 0; i < numPeople; i++)
//		{
//			System.out.println(people[i].toString());
//			if (people[i] instanceof instructor) {	
//				sum = sum + ((instructor) people[i]).getSalary();
//			}
//				
//		}
//		System.out.printf("The total is $%,1.2f", sum);
	}
	
}

