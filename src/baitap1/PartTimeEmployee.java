package baitap1;

public class PartTimeEmployee extends Employee {
	private double hoursWorked;
	private double hourlyRate;

	public PartTimeEmployee() {
	}

	public PartTimeEmployee(String name, int age, double salary, double hours_worked, double hourly_rate) {
		super(name, age, salary);
		this.setHourlyRate(hourly_rate);
		this.setHoursWorked(hours_worked);
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hours_worked) {
		this.hoursWorked = hours_worked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourly_rate) {
		this.hourlyRate = hourly_rate;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.printf("%-15s: %,.1f%n", "Hours worked", this.getHoursWorked());
		System.out.printf("%-15s: %,.1f%n", "Hourly rate", this.getHourlyRate());
		System.out.printf("%-15s: %,.1f%n%n", "Total income", this.calculateSalary());
	}

	@Override
	public double calculateSalary() {
		return this.getSalary() + this.getHoursWorked() * this.getHourlyRate();
	}

}
