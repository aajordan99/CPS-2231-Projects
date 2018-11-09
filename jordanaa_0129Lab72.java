public class jordanaa_0129Lab72 {
	public static void main(String[] args) {
		int[] myList = new int[4];
		for (int i = 0; i < myList.length; i++) {
			myList[i] = i;
			System.out.print(myList[i] + 1 + " ");
		}
		System.out.println();
		for (int i = 3; i >= 0;) {
			System.out.print(myList[i] + 1 + " ");
			i--;
		}
	}

}
