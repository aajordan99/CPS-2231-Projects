import java.util.Arrays;
import java.util.Scanner;
public class jordanaa_0202Lab76 {
	public static void main(String[] args) {
		double [] array = createArray();
		System.out.println(findMax(array) + " is the max value in the array.");
		
	}
	public static double [] createArray() {
		double[] array = new double[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 Values");
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		input.close();
		return array;
	}
	public static double findMax(double [] numbers) {
		Arrays.sort(numbers);
		double max = numbers[numbers.length - 1];
		return max;
	}

}
