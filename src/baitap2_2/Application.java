package baitap2_2;

public class Application {
	public static void main(String[] args) {

		BankAccount bankAccount = new BankAccount();
		bankAccount.setAccountHolder("Tran Van Ti");
		bankAccount.setAccountNumber("1231412412412412");
		bankAccount.setBalance(2000000);
		bankAccount.deposit(1000);
		bankAccount.withdraw(12000);
		bankAccount.displayInfo();

		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.setAccountHolder("Nguyen Thi Ni");
		savingsAccount.setAccountNumber("1232371312123");
		savingsAccount.setBalance(1000);
		savingsAccount.setInterestRate(0.1);
		savingsAccount.addInterest();
		savingsAccount.displayInfo();

		CheckingAccount checkingAccount = new CheckingAccount();
		checkingAccount.setAccountHolder("Huynh Van Teo");
		checkingAccount.setAccountNumber("1313131113");
		checkingAccount.setBalance(100);
		checkingAccount.setOverdraftLimit(1000);
		checkingAccount.withdraw(1050);
		checkingAccount.displayInfo();
	}
}
