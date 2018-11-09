//Aaron Jordan
//This program takes user input for tuition and percentage of increase and calculates
//the total amount over a 10 year period.
import java.util.Scanner;
public class jordanaa_Program1 {
	public static void main (String[] args) {
		int strtYear;
		double increaseAmt, baseTuition, finalTuition = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter starting tuition");
		baseTuition = input.nextDouble();
		double newTuition = baseTuition;
		System.out.println("Enter the starting year");
		strtYear = input.nextInt();
		System.out.println("Enter the yearly percent increase");
		increaseAmt = input.nextDouble();
		input.close();
		for (int i = strtYear; i <= strtYear + 10; i++) {
			baseTuition = finalTuition + baseTuition;
			System.out.printf("Tuition this year (" + i + ") is $%,.0f%n",baseTuition);
			finalTuition = computations(baseTuition, increaseAmt);
		}
		System.out.printf("The total increase over 10 years is $%,.0f%n",(baseTuition - newTuition));
	}
	public static double computations(double baseTuition, double increaseAmt) {
		double finalTuition = baseTuition * increaseAmt / 100;
		return finalTuition;
	}
}
