

public class SkiJumper  implements Flier {
    public void fly() 
    {
        System.out.println("Using skis to take me"+ 
            "into the air");
        System.out.println("I will not go higher than "+  
            Flier. MAX_ALTITUDE + " feet");
    }



}
