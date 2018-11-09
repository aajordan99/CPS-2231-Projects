//Aaron Jordan
//This program takes user input 1 through 100 ending when they input a number outside
//of these boundaries and displays how many times each number is printed.
import java.util.Scanner;
public class jordanaa_Program3 {
	public static void main(String[] args) {
		Scanner occurance = new Scanner(System.in);
		int init = 1;
		int input;
		int [] ar1 = new int [100];
		while (init > 0 && init < 101) {
			System.out.println("Enter a Value between 1 and 100");
			input = occurance.nextInt();
			if (input > 0 && input< 101) {
				ar1[input] = ar1[input] + 1;
			}
			else 
				break;
		}

		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] != 0) {
				System.out.println(i + " occurs " + ar1[i] + " times" );}
		}
		occurance.close();
	}
}
