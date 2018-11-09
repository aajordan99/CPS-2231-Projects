// 2 prints out all 0.0 because by default Java assigns 0.0 to array values until they are 
//assigned.
// 5 prints an out of bounds error because index 4 doesn't exist within the array because
//there is only indexes 0 through 3.
public class jordanaa_0129Lab71 {
	public static void main(String[] args) {
		double[] myList = new double[4];
		System.out.println(myList[0]);
		System.out.println(myList[1]);
		System.out.println(myList[2]);
		System.out.println(myList[3]);
		myList[0] = 99;
		myList[1] = 33;
		myList[2] = 44;
		myList[3] = 22;
		myList[2] = 77;
		System.out.println(myList[0]);
		System.out.println(myList[1]);
		System.out.println(myList[2]);
		System.out.println(myList[3]);
		System.out.println(myList[3]);
		System.out.println(myList[2]);
		System.out.println(myList[1]);
		System.out.println(myList[0]);
		System.out.println(myList[4]);
	}

}
