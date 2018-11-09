public class TestCircle2 {
    public static void main(String[] args) {
        try {
            Circle2 c1 = new Circle2(5);
            Circle2 c2 = new Circle2(-5);
            Circle2 c3 = new Circle2(0);
        }
        catch (InvalidRadiusException ex) {
            System.out.println(ex);
        }

        System.out.println("Number of objects created: " +
            Circle2.getNumberOfObjects());
    }
}
class Circle2 {
    private double radius;
    private static int numberOfObjects = 0;  
    public Circle2() throws InvalidRadiusException   {
        setRadius(1.0);            }
    public Circle2(double newRadius) throws InvalidRadiusException {
        setRadius(newRadius);
        numberOfObjects++;      }
    public double getRadius() {
        return radius;      }
    public void setRadius(double newRadius) throws InvalidRadiusException {
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new InvalidRadiusException(newRadius);  
    }
    public static int getNumberOfObjects() {
        return numberOfObjects;        
    }
    public double findArea() {
        return radius * radius * Math.PI;      
    }    } 