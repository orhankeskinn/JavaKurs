package day3homework2;

public class InstructorManager extends UserManager{

	public void createCourse(Instructor instructor) {
		System.out.println(instructor.getCourseName() + " kursu olu�turuldu");
	}
	
	public void removeCourse(Instructor instructor) {
		System.out.println(instructor.getCourseName() + " kursu silindi");
	}
	
	public void updateCourse(Instructor instructor) {
		System.out.println(instructor.getCourseName() + " kursu g�ncellendi");
	}

}
