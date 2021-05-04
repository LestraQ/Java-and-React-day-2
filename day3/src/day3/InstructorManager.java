package day3;

public class InstructorManager {

	public void add(Instructor instructor) {
		System.out.println("Eðitmen eklendi :" + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
	public void delete(Instructor instructor) {
		System.out.println("Eðitmen silindi :" + instructor.getFirstName() + " " + instructor.getLastName());
	}
	
}
