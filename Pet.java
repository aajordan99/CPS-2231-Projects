


public abstract class Pet
{
   private String name;

   
   public Pet(String petName)
   {
      name = petName;
   }

   public String getName()
   {
      return name;
   }
   @Override
   public String toString()
   {
      return "Pet " + name;
   }

   abstract public String speak();

   public abstract String move();
}
