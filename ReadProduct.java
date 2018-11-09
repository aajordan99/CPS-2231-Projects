import java.io.*;
import java.util.Scanner;
public class ReadProduct {
	public static void main(String[] args)throws IOException{
		double price = 0.0;
		String name = "";
		String free = "";
		File prdct = new File ("product.txt");
		Scanner reader = new Scanner(prdct);

		while (reader.hasNext()) {
			name = reader.next();
			System.out.print(name + " ");
			if (reader.hasNextDouble()) {
				price = reader.nextDouble();
				System.out.println(price);
			}
			else {
				free = reader.next();
				System.out.println(free);
			}
		}
		reader.close();
	}
}
