package day3;

public class Student extends User {

	private int studentAge;
	
	public Student() {
		
	}


	public Student(String firstName, String lastName, String email, String password, int studentAge) {
		super(firstName, lastName, email, password);
		this.setStudentAge(studentAge);
	}


	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	
}
