

public class Dog extends Pet    {
    private int weight;

    public Dog(String dogName, int dogWeight)       {
        super(dogName);
        weight = dogWeight;
    }
    public int getWeight()       {
        return weight;
    }
    @Override
    public String toString()       {
        return super.toString() + " is a dog, weighing " + weight + " pounds";
    }
    @Override
    public String speak()
    {
        return "woof";
    }
    @Override
    public String move()
    {
        return "run";
    }
 }
