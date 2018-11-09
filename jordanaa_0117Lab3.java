import java.util.Scanner;
public class jordanaa_0117Lab3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter a value, -1 to end.");
		int num = reader.nextInt();
		
		while (num != -1) {
			sum = sum + num;
			System.out.println("Enter a value, -1 to end.");
			num = reader.nextInt();
		}
		System.out.println("The sum is " + sum);
	}

}
