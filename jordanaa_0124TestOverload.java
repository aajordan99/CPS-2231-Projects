public class jordanaa_0124TestOverload {
	public static void main(String[] args) {
		//max of 33 and 89
		printMax(33, 89);
		//max of 55,11, and 99
		printMax(55, 11, 99);
	}

	public static void printMax(int num1, int num2) {
		if (num1 > num2)
			System.out.println("The highest is " + num1);
		else if (num2 > num1)
			System.out.println("The higheset is " + num2);
	}

	public static void printMax(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			System.out.println("The highest is " + num1);
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println("The higheset is " + num2);
		}
		else 
			System.out.print("The highest is " + num3);
	}
}
