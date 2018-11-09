

public class TestGeometricObject2 {
    /** Main method */
    public static void main(String[] args) {
        // Declare and initialize an Array of Geometric Objects
        GeometricObject [] geos = new GeometricObject[5];
        geos [0] = new Circle(5);
        geos [1] = new Rectangle(5, 3);
        geos [2] = new Circle(10);
        geos [3] = new Rectangle(10, 6);
        geos [4] = new Circle(8);
        System.out.println("Printing Geometric objects");
        printGeometricObjects(geos);

    }
    /** A method for displaying geometric object */
    public static void printGeometricObjects(GeometricObject[] shapes) {
        for (int i = 0; i < shapes.length; i++)
        {
        System.out.println();
        System.out.println("The area is " + shapes[i].getArea());
        System.out.println("The perimeter is " + shapes[i].getPerimeter());
            
        }
       
    }
}