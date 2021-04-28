package homework;

public class Main {

	public static void main(String[] args) {
		Course csharp = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� - C# Angular", 
				"Engin Demiro�", "T�rk�e" );
		Course java = new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� - Java React", 
				"Engin Demiro�", "T�rk�e" );
		Course temelKurs = new Course(2,"Programlamaya Giri� ��in Temel Kurs", 
				"Engin Demiro�", "T�rk�e" );
		
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
