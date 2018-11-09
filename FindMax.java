public class FindMax {
	public static void main(String[] args) {
		int [] list = {99,12,101,36,51};
		System.out.println("The max value is " + findMax(list));
		System.out.println("The min value is " + findMin(list));
	}
	public static int findMax(int[] array) {
	int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;	
	}
	public static int findMin(int[] array) {
		int min = array[0];
			for (int i = 1; i < array.length; i++) {
				if (array[i] < min) {
					min = array[i];
				}
			}
			return min;	
		}
}
