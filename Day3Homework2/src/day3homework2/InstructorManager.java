package day3homework2;

public class InstructorManager extends UserManager{

	public void createCourse(Instructor instructor) {
		System.out.println(instructor.getCourseName() + " kursu oluşturuldu");
	}
	
	public void removeCourse(Instructor instructor) {
		System.out.println(instructor.getCourseName() + " kursu silindi");
	}
	
	public void updateCourse(Instructor instructor) {
		System.out.println(instructor.getCourseName() + " kursu güncellendi");
	}

}
