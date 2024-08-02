package baitap2_2;

public class SavingsAccount extends BankAccount {
	private double interestRate;

	public SavingsAccount() {
	}

	public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
		super(accountNumber, accountHolder, balance);
		this.setInterestRate(interestRate);
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void addInterest() {
		double interest = this.getBalance() * this.getInterestRate();
		this.deposit(interest);
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.printf("%-15s: %,.2f%%%n", "Lãi suất", this.getInterestRate() * 100);
	}
}
