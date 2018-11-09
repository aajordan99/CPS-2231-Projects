

public class TestPet
{
    public static void main (String[] args)
    {
        //Pet p0 = new Pet("Karma");
        Pet p1 = new Dog("Fido", 45);

        Pet p2 = new Snake("Sam", 30);
        
        System.out.println(p1);
        System.out.println(p1.getName() + " says " + p1.speak());
        System.out.println(p1.move() + " " + p1.getName() + " "
            + p1.move());

        System.out.println();
        System.out.println(p2);
        System.out.println(p2.getName() + " says " + p2.speak());
        System.out.println(p2.move() + " " + p2.getName() + " "
            + p2.move());

        System.out.println();
          
        //Uncomment the p3 reference below and set it to a new Cat object
        //Print the information about the cat as shown in the sample output
        
        //Pet p3 = 
        
     
     
        System.out.println();
        
        
    }
}
