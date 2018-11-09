
public class jordanaa_0129Lab73 {

	public static void main(String[] args) {
		int[] myList = new int[5];
		myList[0] = 11;
		myList[1] = 22;
		myList[2] = 33;
		myList[3] = 44;
		myList[4] = 55;
		myList[3] = 88;
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		System.out.println();
		for (int i = 4; i >= 0;) {
			System.out.print(myList[i] + " ");
			i--;
		}

	}

}
