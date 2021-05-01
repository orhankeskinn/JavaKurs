package day3homework2;

public class UserManager{

	public void addUser(User user) {
		System.out.println("Kiþi Eklendi : " + user.getFirstName() + user.getLastName());
	}

	public void removeUser(User user) {
		System.out.println("Kiþi Silindi : " + user.getFirstName() + user.getLastName());
	}

	public void updateUser(User user) {
		System.out.println("Kiþi Güncellendi : " + user.getFirstName() + user.getLastName());
	}
}
