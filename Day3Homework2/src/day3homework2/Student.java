package day3homework2;

public class Student extends User {
	private String studentNumber;

	public Student() {

	}

	public Student(int id, String firstName, String lastName, String password, String email, String courseName,
			String studentNumber) {

		super(id, firstName, lastName, password, email, courseName);
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

}