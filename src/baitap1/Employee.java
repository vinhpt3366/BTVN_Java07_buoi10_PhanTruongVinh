package baitap1;

public class Employee {
	private String name;
	private int age;
	private double salary;

	public String getName() {
		return name;
	}

	public Employee() {
	}

	public Employee(String name, int age, double salary) {
		this.setName(name);
		this.setAge(age);
		this.setSalary(salary);
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void displayInfo() {
		System.out.println("------ Employee Info ------");
		System.out.printf("%-15s: %s%n", "Name", this.getName());
		System.out.printf("%-15s: %d%n", "Age", this.getAge());
		System.out.printf("%-15s: %,.1f%n", "Salary", this.getSalary());
	}

	public double calculateSalary() {
		return this.getSalary();
	}
}
