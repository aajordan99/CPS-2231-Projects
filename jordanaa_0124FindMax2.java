public class jordanaa_0124FindMax2 {
	public static void main(String[] args) {
		//find the max of 5 and 9
		int max = findMax(11, 3);
		System.out.println(max);
		//find the max of 5 and 9
		max = findMax(5, 9);
		System.out.println(max);
		//find the max of 7 and 7
		max = findMax(7, 7);
		System.out.println(max);

	}
	public static int findMax(int num1, int num2){
		if (num1 > num2) {
			return num1;
		}
		else 
			return num2;
	}
}


