package day3;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullan�c� eklendi :" + user.getFirstName() + " " + user.getLastName());
	}
	
	public void delete(User user) {
		System.out.println("Silinen kullan�c� bilgileri :" + user.getFirstName() + " " + user.getLastName() + " " + user.getEmail());
	}
}
