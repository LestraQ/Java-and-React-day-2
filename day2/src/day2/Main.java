package day2;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"C#","Engin Demiro�","Yaz�l�m Geli�tirici ve Yeti�tirme Kamp�(C#+Angular)");
		
		Course course2 = new Course(2,"Java","Engin Demiro�","Yaz�l�m Geli�tirici ve Yeti�tirme Kamp�(Java+React)");
		
		Course course3 = new Course(3,"Temel Kurs","Engin Demiro�","Programlamaya Giri� ��in Temel Kurs(PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.)");
		
		Course [] courses={course1,course2,course3};
		
		for(Course course:courses) {
			System.out.println(course.id+" "+course.name+" "+course.description);
		}
		
		CourseManager courseManager = new CourseManager();
		 courseManager.addCourse(course1);
		 courseManager.addCourse(course2);
		 courseManager.deleteCourse(course2);
		 
		Category category1=new Category(1,"Programlama"); 
		 
		Category[] categories=new Category[] {category1};
		 
		for(Category category:categories) {
			 System.out.println(category.id+" "+category.name );
			 
		 }
		 
		CategoryManager categoryManager=new CategoryManager();
		categoryManager.addCategory(category1);
		categoryManager.deleteCategory(category1);
		
				
	}

}
