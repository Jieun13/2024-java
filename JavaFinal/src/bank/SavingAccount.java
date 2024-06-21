package bank;

public class SavingAccount extends BankAccount {
	
	private double interestRate;
	
	public SavingAccount() {
		interestRate = 0;
	}
	
	public SavingAccount(String accountNumber, double balance, double inputRate) {
		super(accountNumber, balance);
		interestRate = inputRate;
	}
	
	public void withdraw(double amount) {
		double balance = getBalance() * (1 + (0.01 * interestRate));
		super.setBalance(balance);
		super.withdraw(amount);
	}

}
