import java.util.Scanner;
public class jordanaa_0202Lab75 {
	public static void main(String[] args) {
		double sum = 0;
		double[] array = new double[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 Values");
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
			sum += array[i];
		}
		input.close();
		System.out.println(sum);
		printHigherThanAverage(array, sum);
	}
	public static void printHigherThanAverage(double [] array , double sum) {
		double avg = sum / 5;
		System.out.print("The average is " + avg);
		System.out.println();
		for (int i = 0; i < 5; i ++) {
			if (array[i] > avg) {
				System.out.print(array[i] + " is higher than the average");
				System.out.println();
			}
			else break;
		}
	}

}
