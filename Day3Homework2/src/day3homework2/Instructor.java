package day3homework2;

public class Instructor extends User {

	private String instructorNumber;

	public Instructor(){

	}

	public Instructor(int id, String firstName, String lastName, String password, String email, String courseName,
			String instructorNumber) {

		super(id, firstName, lastName, password, email, courseName);
		this.instructorNumber = instructorNumber;

	}

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

}
