package baitap2_2;

public class CheckingAccount extends BankAccount {
	private double overdraftLimit;

	public CheckingAccount() {
	}

	public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
		super(accountNumber, accountHolder, balance);
		this.setOverdraftLimit(overdraftLimit);
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		double max = this.getBalance() + this.getOverdraftLimit();
		if (amount > 0 && amount <= max) {
			this.setBalance(this.getBalance() - amount);
			System.out.println("-----------");
			System.out.println("Đã rút " + amount + " khỏi tài khoản.");
		} else {
			System.out.println("Số tiền rút không hợp lệ.");
		}
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.printf("%-15s: %,.1f%n", "Hạn mức", this.getOverdraftLimit());
	}

}
