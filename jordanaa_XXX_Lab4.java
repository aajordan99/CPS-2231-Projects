import java.util.Scanner;
public class jordanaa_XXX_Lab4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [][] nums = new int [2][3];
		System.out.println("Enter Values");
		for (int rows = 0; rows < nums.length; rows++) {
			for(int col = 0; col < nums[rows].length; col++) {
				nums[rows][col] = input.nextInt();
			}
		}
		int max = nums[0][0];
		int min = nums [0][0];
		for (int rows = 0; rows < nums.length; rows++) {
			for(int col = 0; col < nums[rows].length; col++) {
				if(nums[rows][col] > max) {
					max = nums[rows][col];
				}
			}
			for (rows = 0; rows < nums.length; rows++) {
				for(int col = 0; col < nums[rows].length; col++) {
					if(nums[rows][col] < min) {
						min = nums[rows][col];
					}
				}
			}
			System.out.print("The highest value is " + max + "\n");
			System.out.print("The lowest value is " + min);
		}
	}
}


