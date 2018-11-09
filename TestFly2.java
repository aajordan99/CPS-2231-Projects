

public class TestFly2
{
    public static void main (String args[])
    {
        Flier [] fl  = new Flier[3];
        fl[0] = new Bird();
        fl[1] = new Airplane();
        fl[2] = new SkiJumper();

        for (int i = 0;  i < fl.length;  i++)
            fl[i].fly();
    }
}

