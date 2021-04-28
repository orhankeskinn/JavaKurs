package homework;

public class Main {

	public static void main(String[] args) {
		Course csharp = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý - C# Angular", 
				"Engin Demiroð", "Türkçe" );
		Course java = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý - Java React", 
				"Engin Demiroð", "Türkçe" );
		Course temelKurs = new Course(2,"Programlamaya Giriþ Ýçin Temel Kurs", 
				"Engin Demiroð", "Türkçe" );
		
		Course[] Courses = {csharp, java, temelKurs};
		
		for( Course Course : Courses) {
			System.out.println(Course.courseName);
		}
		
		CourseManager manager = new CourseManager();
		manager.addCourse(temelKurs);
		manager.addCourse(java);
		manager.addCourse(csharp);
		manager.updateCourse(csharp);
	}

}
