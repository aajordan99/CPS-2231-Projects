import java.util.*;
public class ExceptionLab {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		int [] numbers = new int [100];

		
			for (int i = 0; i < 100; i++)
			{
				numbers [i] = (int)(Math.random() * 100 + 1);
			}
			System.out.println("Enter an index value from 0 to 99");
			int index = reader.nextInt();
			//the statement following should be in the try clause
			try {
			System.out.println( numbers [index]);
			//add catch and finally
			reader.close();
		}

		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index value cannot be 100.\nThe array can only hold 100 elements");
		}

		finally  {
			for (int x = 0; x < numbers.length; x++) {

				System.out.print(numbers[x] + " " );
				if (x % 20 == 0) {
					System.out.println("\n");
				}
			}
		}
	}

}
