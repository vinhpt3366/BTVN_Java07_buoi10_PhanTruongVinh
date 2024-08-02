package baitap1;

public class FullTimeEmployee extends Employee {
	private double benefits;

	public FullTimeEmployee() {
	}

	public FullTimeEmployee(String name, int age, double salary, double benefits) {
		super(name, age, salary);
		this.setBenefits(benefits);
	}

	public double getBenefits() {
		return benefits;
	}

	public void setBenefits(double benefits) {
		this.benefits = benefits;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.printf("%-15s: %,.1f%n", "Benefits", this.getBenefits());
		System.out.printf("%-15s: %,.1f%n%n", "Total income", this.calculateSalary());
	}

	@Override
	public double calculateSalary() {
		return this.getSalary() + this.getBenefits();
	}
}
