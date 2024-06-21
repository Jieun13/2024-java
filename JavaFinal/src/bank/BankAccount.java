package bank;

public class BankAccount {
	
	private String accountNumber; // 계좌 번호
	private double balance; // 잔액
	
	public BankAccount() {
		accountNumber = "12345";
		balance = 0;
	}
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void setBalance(double bal) {
		balance = bal;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println(amount + "원이 입금되었습니다. 새로운 잔액 : " + balance + "원");
	}
	
	public void deposit(double amount, String currency) {
		double money = 0.0;
		
		if(currency.equals("KRW")) {
			money = amount;
		}
		else if(currency.equals("USD")) {
			money = amount * 1300;
		}
		else if(currency.equals("EUR")) {
			money = amount * 1500;
		}
		else {
			System.out.println("지원되지 않는 통화입니다.");
		}
		balance += money;
		System.out.println(amount + currency + "가 입금되었습니다. 새로운 잔액 : " + balance + "원");
	}
	
	public void withdraw(double amount) {
		if(balance>=amount) {
			balance -= amount;
			System.out.println(amount + "원이 출금되었습니다. 새로운 잔액 : " + balance + "원");
		}
		else {
			System.out.println("잔액이 부족합니다. 현재 잔액 : " + balance + "원");
		}
	}
	
	public String toString() {
		return "계좌 번호 : " + accountNumber + "\t잔액 : " + balance + "원";
	}

}
