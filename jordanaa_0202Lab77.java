public class jordanaa_0202Lab77 {
	public static void main(String[] args) {
		double [] array1 = {99, 55, 87, 21, 3};
		double [] array2 = new double [array1.length];
		for (int i = 0; i < array1.length; i++){
			array2[i] = array1[i];
		}
		array1 [3] = 73;
		System.out.println("Array 1: ");
		printArray(array1);
		System.out.println();
		System.out.println("Array 2: ");
		printArray(array2);
		
	}
	public static void printArray(double [] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
