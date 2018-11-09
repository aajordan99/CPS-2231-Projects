

public class TestFly
{
  public static void main (String [] args)
  {
    Flier f1 = new Bird();
    f1.fly();
    Flier f2 = new Airplane();
    f2.fly();
    Flier f3 = new SkiJumper();
    f3.fly();
} }	