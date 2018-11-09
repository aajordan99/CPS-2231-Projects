import java.util.Scanner;
public class testfiles {
	public static void main(String[] args) {
		Scanner arInput = new Scanner(System.in);
		int x;
		System.out.println("Enter amount of numbers you wish to input: ");
		x = arInput.nextInt();
		int[] firstLast6 = new int[x];
		System.out.println("Enter Values: ");
		for (int i = 0; i > firstLast6.length; i++){
			i = arInput.nextInt();
		}
	}

}
