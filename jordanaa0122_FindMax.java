public class jordanaa0122_FindMax {

	public static void main(String[] args) {
		//find the max of 5 and 9
		findMax(5,9);
		//find the max of 100 and 39
		findMax(39,100);
	}
	public static void findMax(int num1, int num2) {
		if (num1 > num2)
			System.out.println(num1 + " is the highest");
		else if (num2 > num1)
			System.out.println(num2 + " is the highest");
		else
			System.out.println(num1+ " and " + num2  + " are equal");
	}
}