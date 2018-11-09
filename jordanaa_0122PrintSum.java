public class jordanaa_0122PrintSum {
	public static void main(String[] args) {
		//print the sum from 1 to 10
		printSum(1, 10);

		//print the sum from 20 to 30
		printSum(20, 30);

		//print the sum from 35 to 45
		printSum(35, 45);

	}
	public static void printSum(int startNum, int endNum)
	{
		//print the sum from startNum to endNum
		int sum = 0;
		for (int i = startNum; i <= endNum; i++)
			sum += i;
		System.out.println("Sum from " + startNum +" to " +
				endNum + " is " + sum);
	}


}