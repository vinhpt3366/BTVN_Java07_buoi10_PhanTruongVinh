package baitap1;

public class Application {
	public static void main(String[] args) {
		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
		fullTimeEmployee.setName("Nguyen Van Ti");
		fullTimeEmployee.setAge(25);
		fullTimeEmployee.setSalary(2000);
		fullTimeEmployee.setBenefits(1200);
		fullTimeEmployee.displayInfo();

		PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Nguyen Van Teo", 20, 500, 8, 100);
		partTimeEmployee.displayInfo();

	}
}
