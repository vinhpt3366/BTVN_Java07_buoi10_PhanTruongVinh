package baitap3;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
	private String studentId;
	private List<String> courses;

	public Student() {
		this.courses = new ArrayList<>();
	}

	public Student(String name, int age, String address, String studentId) {
		super(name, age, address);
		this.setStudentId(studentId);
		this.courses = new ArrayList<>();
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getAllCourses() {
		return String.join(", ", this.courses);
	}

	@Override
	public void displayInfo(String person) {
		super.displayInfo(person);
		System.out.printf("%-18s: %s%n", "Student ID", this.getStudentId());
		System.out.printf("%-18s: %s%n%n", "Enrolled Courses", this.getAllCourses());
	}

	public void enroll(String course) {
		this.courses.add(course);
	}

}
