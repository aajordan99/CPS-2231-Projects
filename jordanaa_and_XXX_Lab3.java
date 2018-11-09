import java.util.Scanner;
public class jordanaa_and_XXX_Lab3 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		double [][] array = new double [3][3];
		System.out.println("Enter Values to fill array");
		for (int rows = 0; rows < array.length; rows++) {
			for(int col = 0; col < array[rows].length; col++) {
				array[(int) rows][(int) col] = x.nextDouble();
			}
		}
		System.out.println("\n3 by 3\n");
		for (int rows = 0; rows < array.length; rows++) {
			for(int col = 0; col < array[rows].length; col++) {
				System.out.print(array[rows][col] + " ");
				col++;
				System.out.print(array[rows][col] + " ");
				col++;
				System.out.print(array[rows][col] + " ");
				System.out.println();
			}
		}
		System.out.println("\nRow Major Order");
		for (int rows = 0; rows < array.length; rows++) {
			for(int col = 0; col < array[rows].length; col++) {
				System.out.print(array[rows][col] + "  ");
			}
		}

		System.out.println("\n\nColumn Major Order");
		for (int rows = 0; rows < array.length; rows++) {
			for(int col = 0; col < array[rows].length; col++) {
				System.out.print(array[col][rows] + "  ");
			}
		}
	}
}
