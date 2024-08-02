package baitap3;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
	private String employeeId;
	private List<String> subjects;

	public Teacher() {
		this.subjects = new ArrayList<>();
	}

	public Teacher(String name, int age, String address, String employeeId) {
		super(name, age, address);
		this.setEmployeeId(employeeId);
		this.subjects = new ArrayList<>();
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getAllSubjects() {
		return String.join(", ", this.subjects);
	}

	@Override
	public void displayInfo(String person) {
		super.displayInfo(person);
		System.out.printf("%-18s: %s%n", "Employee ID", this.getEmployeeId());
		System.out.printf("%-18s: %s%n%n", "Assigned Subjects", this.getAllSubjects());
	}

	public void assign(String assign) {
		this.subjects.add(assign);
	}
}
