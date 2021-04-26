

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Category category1 = new Category(1, "Programlama");
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiro�", "MCT,PMP,ITIL");
		
		Course course1 = new Course(1, "C# + Angular", "Engin Demiro�", "2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.");
		Course course2 = new Course(2, "Java + React", "Engin Demiro�", "2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.");
		Course course3 = new Course(3, 
				"Programlamaya Giri� ��in Temel Kurs", 
				"Engin Demiro�", "PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.");
		
		Course[] courses = new Course[]{
			course1, course2, course3
		};
		
		CourseManager courseManager = new CourseManager();
		
		
		for(Course course : courses) {
			System.out.println(course.courseId);
			System.out.println(course.courseName);
			System.out.println(course.instructor);
			System.out.println(course.detail);
			System.out.println("---------------------");
		};
		
		
	}

}
