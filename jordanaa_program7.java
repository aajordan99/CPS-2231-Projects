import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class jordanaa_program7 {
	public static void main(String[] args)throws IOException {
		File file = new File("program7.txt");
		Scanner input = new Scanner (file);
		int x = 0;
		String name = "";
		int birth = 0;
		double bill = 0.0;
		String species = "";


		while (input.hasNextInt()) {
			x = input.nextInt();
			animal[] a1 = new animal[x];

			System.out.printf("%-10s %6s %15s %14s", "Owner", "DOB", "Bill", "Species");
			System.out.println( "\n");
			for (int i = 0; i < x ; i++) {
				name = input.next();
				birth = input.nextInt();
				bill = input.nextDouble();
				species = input.next();
				a1[i] = new animal(name, birth, bill, species);
				System.out.printf("%-10s %6d %,15.2f %14s" , name, birth, bill, species);
				System.out.println();
			}		
		}	
		input.close();	
	}


}

	class animal {

	private String owner;
	private int bYear;
	private double bill;
	private String species;

	public animal() {
		owner = "";
		bYear = 0;
		bill = 0.0;
		species = "";
	}

	public animal(String owner, int bYear, double bill, String species) {
		this.owner = owner;
		this.bYear = bYear;
		this.bill = bill;
		this.species = species;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBYear() {
		return bYear;
	}

	public void setBYear(int bYear) {
		this.bYear = bYear;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
}

