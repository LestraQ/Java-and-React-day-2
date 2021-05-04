package day3;

public class StudentManager {

	public void add(Student student) {
		System.out.println("Öğrenci eklendi :" + student.getFirstName() + " " + student.getLastName() + " " + student.getStudentAge());
	}
	
	public void delete(Student student) {
		System.out.println("Öğrenci silindi :" + student.getFirstName() + " " + student.getLastName() + " " + student.getStudentAge());
	}
	
}
