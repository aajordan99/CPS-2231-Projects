
public class BankAccount {

	//instance var (obj)
	private double balance;
	//no-args constructor (no arguements or parameters)
	public BankAccount() {
		balance = 0.0;
	}
	
	//constructor with input
	public BankAccount(double initialAmount) {
		balance = initialAmount;
	}
	
	//adds to balance
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	//sub from balance
	public void withdrawal(double amount) {
		balance = balance - amount;
	}
	
	//getter method
	public double getBal() {
		return balance;
	}
	
	
	
	
}
