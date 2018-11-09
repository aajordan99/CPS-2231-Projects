


public class Snake extends Pet
{
   private int length;

   
   public Snake(String snakeName, int snakeLength)
   {
      super(snakeName);
      length = snakeLength;
   }

   
   public int getLength()
   {
      return length;
   }
   @Override
   public String toString()
   {
      return super.toString() + " is a snake, " + length + " inches long";
   }
   @Override
   public String speak()
   {
      return "hiss";
   }
   @Override
   public String move()
   {
      return "slither";
   }
}
