import java.util.Scanner; 
public class QuotientWithIf { 
    public static void main(String[] args)        { 
        Scanner input = new Scanner(System.in); 
        // Prompt the user to enter two integers                
        System.out.print("Enter two integers: "); 
        int number1 = input.nextInt(); 
        int number2 = input.nextInt(); 
        if (number2 != 0)   {
            int result = quotient(number1, number2);                
            System.out.println(number1 + " / " + number2 + " is " +
                result); 
            }
        else
            System.out.println("The Second number cannot be zero");        } 
    public static int quotient(int number1, int number2) {
        return number1 / number2;            } 
}
