package baitap3;

public class Course {
	private String courseName;
	private String courseCode;
	private Teacher teacher;

	public Course() {
	}

	public Course(String courseName, String courseCode) {
		this.setCourseName(courseName);
		this.setCourseCode(courseCode);
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public void assignTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void displayInfo() {
		System.out.println("------- Course Info -------");
		System.out.printf("%-15s: %s%n", "Course Name", this.getCourseName());
		System.out.printf("%-15s: %s%n", "Course Code", this.getCourseCode());
		if (this.teacher != null) {
			System.out.printf("%-15s: %s%n", "Teacher", this.teacher.getName());
		}
	}

}
