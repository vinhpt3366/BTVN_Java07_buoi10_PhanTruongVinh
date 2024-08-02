package baitap2_2;

public class BankAccount {
	protected String accountNumber;
	protected String accountHolder;
	protected double balance;

	public BankAccount() {
	}

	public BankAccount(String accountNumber, String accountHolder, double balance) {
		this.setAccountNumber(accountNumber);
		this.setAccountHolder(accountHolder);
		this.setBalance(balance);
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			this.setBalance(this.getBalance() + amount);
			System.out.println("++++++++++++");
			System.out.println("Đã gửi " + amount + " vào tài khoản.");
		} else {
			System.out.println("Số tiền gửi không hợp lệ.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= this.getBalance()) {
			this.setBalance(this.getBalance() - amount);
			System.out.println("-----------");
			System.out.println("Đã rút " + amount + " khỏi tài khoản.");
		} else {
			System.out.println("Số tiền rút không hợp lệ.");
		}
	}

	public void displayInfo() {
		System.out.printf("%n---- Thông tin ngân hàng ----%n");
		System.out.printf("%-15s: %s%n", "Chủ tài khoản", this.getAccountHolder());
		System.out.printf("%-15s: %s%n", "Số tài khoản", this.getAccountNumber());
		System.out.printf("%-15s: %,.1f%n", "Số dư", this.getBalance());
	}

}
