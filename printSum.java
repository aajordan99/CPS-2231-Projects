
public class printSum {

	public static void main(String[] args) {
		int [][] array = {
					{11, 22, 33},
					{5, 6 , 7}
			};
		System.out.println(findSum(array));
		System.out.println(array[0].length);
	}

	public static int findSum(int [][] array) {
		int sum = 0;
		for (int rows = 0; rows < array.length; rows++) {
			for (int col = 0; col < array[rows].length; col++) {
				sum = sum + array[rows][col];
			}
		}
			
		return sum;
	}
}