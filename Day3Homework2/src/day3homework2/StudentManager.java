package day3homework2;

public class StudentManager extends UserManager{

	public void enrollCourse(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " Adl� ��renci kursa kaydoldu");
	}
	
	public void removeFromCourse(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " Adl� ��renci kursdan silindi");
	}

}