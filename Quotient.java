import java.util.Scanner; 
public class Quotient { 
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in); 
        // Prompt the user to enter two integers 				
        System.out.print("Enter two integers: "); 
        int number1 = input.nextInt(); 
        int number2 = input.nextInt(); 
        int result = quotient(number1, number2); 				
        System.out.println(number1 + " / " + number2 + " is " +
            result); 
    } 

    public static int quotient(int number1, int number2) {
        return number1 / number2;    
    } 
}	