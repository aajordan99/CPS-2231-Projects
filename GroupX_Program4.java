import java.util.Scanner;
public class GroupX_Program4 {
	public static void main(String[] args) {
		int [][] numbs = new int [3][12];
		String [][] titles = {
				{"State			Jan		Feb		Mar		Apr		May		Jun		Jul		Aug		Sep		Oct		Nov		Dec"},
				{"New Jersey"},
				{"New York"},
				{"Pennsylvania"}
		};
		for (int x = 0; x < numbs.length; x++) {
			System.out.print("Enter 12 months of rainfall in inches for New Jersey ");
			createArray(x, numbs);
			x++;
			System.out.print("Enter 12 months of rainfall in inches for New York ");
			createArray(x, numbs);
			x++;
			System.out.print("Enter 12 months of rainfall in inches for Pennsylvania ");
			createArray(x, numbs);
		
		}
		System.out.println(titles[0][0]);
		
		
	
		
//		for (int row = 1; row < titles.length; row++) {
//			for (int col = 0; col < titles[row].length; col++) {
//				System.out.print(titles[row][col] + "\n");
//			}
//	}
//		System.out.print(extra(numbs));
//		for (int x = 0; x < numbs.length; x++) {
//			System.out.print("Enter 12 months of rainfall in inches for New Jersey ");
//			createArray(x, numbs);
//			x++;
//			System.out.print("Enter 12 months of rainfall in inches for New York ");
//			createArray(x, numbs);
//			x++;
//			System.out.print("Enter 12 months of rainfall in inches for Pennsylvania ");
//			createArray(x, numbs);
//		
//		}
		
		for (int x = 0; x < numbs.length; x++) {
			System.out.print("\nNew Jersey total Rainfall ");
			System.out.println(printRainfall(x, numbs) * 1.0);
			x++;
			System.out.print("New York total Rainfall ");
			System.out.println(printRainfall(x, numbs) * 1.0);

			x++;
			System.out.print("Pennsylvania total Rainfall ");
			System.out.println(printRainfall(x, numbs) * 1.0);

		
		}

	}

	public static int[][] createArray(int x, int [][] array) {
		Scanner all = new Scanner(System.in);
//		
//		System.out.print("Enter 12 months of rainfall in inches for ");
		for (int i = 0; i < 12; i++) {
			array[x][i] = all.nextInt();
		}
		return array;
	}


		public static int printRainfall(int x, int [][] array) {
			int sum = 0;
			for (int rows = 0; rows < array.length; rows++) {
				for (int col = 0; col < array[x].length; col++) {
					sum = sum + array[x][col];
				}
			}
				
			return sum;
		}

//		public static int extra (int [][] numbs) {
//			for (int x = 0; x < numbs.length; x++) {
//				System.out.print("Enter 12 months of rainfall in inches for ");
//				createArray(x, numbs);
//			}
//			return printRainfall(numbs);
//		}


}
