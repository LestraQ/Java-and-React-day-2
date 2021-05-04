package day3;

public class Instructor extends User {


	private String instructorNumber;
	
	public Instructor() {
		
	}

	public Instructor(String firstName, String lastName, String email, String password, String instructorNumber) {
		super(firstName, lastName, email, password);
		this.instructorNumber = instructorNumber;
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
	
}
	


