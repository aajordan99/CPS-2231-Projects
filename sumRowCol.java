
public class sumRowCol {

	public static void main(String[] args) {
		int [][] table = {
			{1,2,3},
			{8,9,2}
		};
		printSumCol(1,table);
		printSumRow(0,table);
	}
	
	
public static void printSumCol(int colNum, int [][] table) {
	int sum = 0;
	for (int row = 0; row < table.length; row++) {
		sum = sum + table[row][colNum];
	}
	System.out.println("The sum of col " + colNum + " is " + sum);
}

public static void printSumRow(int rowNum, int [][] table) {

	int sum = 0;
	for (int col = 0; col < table[0].length; col++) {
		sum = sum + table[rowNum][col];
	}
	System.out.println("The sum of row " + rowNum + " is " + sum);
}

	


}

