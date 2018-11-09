//Aaron Jordan
//This program creates a triangle out of the * symbol based on how many rows the user
//decides to input. 3 triangles are made, one from small to large, one from large to small,
//and another from large to small except it is flushed right.
import java.util.Scanner;
public class jordanaa_Program2 {
	public static void main(String[] args) {
		int input;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		input = reader.nextInt();
		reader.close();
		System.out.println("Printing Triangle 1");
		printTriangle1(input);
		System.out.println("Printing Triangle 2");
		printTriangle2(input);
		System.out.println("Printing Triangle 3");
		printTriangle3(input);
	}
	public static void printTriangle1(int input) {
		char x = '*';
		int i, j;
		for (i = 1; i <= input; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
	public static void printTriangle2(int input) {
		char x = '*';
		int i, j;
		for (i = input; i > 0; i--) {
			for (j = i; j > 0; j--) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
	public static void printTriangle3(int input) {
		char x = '*';
		int i, j;
		for (i = input; i > 0; i--) {
			for(int y = i; y < input; y++) {
				System.out.print(" ");}
			for (j = i; j > 0; j--) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
}


