package day3homework2;

public class StudentManager extends UserManager{

	public void enrollCourse(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " Adlı öğrenci kursa kaydoldu");
	}
	
	public void removeFromCourse(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " Adlı öğrenci kursdan silindi");
	}

}