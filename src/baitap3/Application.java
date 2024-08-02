package baitap3;

public class Application {
	public static void main(String[] args) {

		Student student = new Student();
		student.setName("Nguyen Van Ti");
		student.setAge(20);
		student.setAdddress("Ha Noi");
		student.setStudentId("SV123456");
		student.enroll("Java07");
		student.displayInfo("Student");

		Teacher teacher = new Teacher();
		teacher.setName("Tran Van Teo");
		teacher.setAge(32);
		teacher.setAdddress("Hai Phong");
		teacher.setEmployeeId("GV321321");
		teacher.assign("Java core");
		teacher.displayInfo("Teacher");

		Course course = new Course();
		course.setCourseName("Java07");
		course.setCourseCode("C678678");
		course.assignTeacher(teacher);
		course.displayInfo();

	}
}
