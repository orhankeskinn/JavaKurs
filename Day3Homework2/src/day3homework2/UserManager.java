package day3homework2;

public class UserManager{

	public void addUser(User user) {
		System.out.println("Ki�i Eklendi : " + user.getFirstName() + user.getLastName());
	}

	public void removeUser(User user) {
		System.out.println("Ki�i Silindi : " + user.getFirstName() + user.getLastName());
	}

	public void updateUser(User user) {
		System.out.println("Ki�i G�ncellendi : " + user.getFirstName() + user.getLastName());
	}
}
