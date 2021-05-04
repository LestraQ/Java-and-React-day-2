package day3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("engin@gmail.com");
		instructor1.setInstructorNumber("1");
		instructor1.setPassword("123456");
		
		System.out.println("Eğitmen adı ve soyadı :" + instructor1.getFirstName() + " " + instructor1.getLastName() + " Eğitmen numarası :" + instructor1.getInstructorNumber() );                        
		
		Student student1 = new Student();
		student1.setFirstName("Kemal");
		student1.setLastName("Aslan");
		student1.setEmail("kaslan3805@gmail.com");
		student1.setStudentAge(15);
		student1.setPassword("123456");
		
		System.out.println("Öğrenci adı ve soyadı :" + student1.getFirstName() + " " + student1.getLastName() + " Öğrenci yaşı :" + student1.getStudentAge());
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.delete(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.delete(student1);
		
		
		
	}

}
