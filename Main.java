

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Category category1 = new Category(1, "Programlama");
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroð", "MCT,PMP,ITIL");
		
		Course course1 = new Course(1, "C# + Angular", "Engin Demiroð", "2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.");
		Course course2 = new Course(2, "Java + React", "Engin Demiroð", "2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.");
		Course course3 = new Course(3, 
				"Programlamaya Giriþ Ýçin Temel Kurs", 
				"Engin Demiroð", "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.");
		
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
