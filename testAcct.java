import java.util.Scanner;
public class testAcct {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
//		dataType refVar = new dataType (parameters);
	
	BankAccount b1 = new BankAccount(1000.00);
	BankAccount b2 = new BankAccount(4000.00);
	
	System.out.println("The balance is " + b1.getBal());
	
	b1.deposit(300);

	System.out.println("The balance is " + b1.getBal());
	
	System.out.println("Withdrawal \t Deposit \t View Balance");
	String choice = reader.next();
	System.out.println(choice);
	
	
	}

}
