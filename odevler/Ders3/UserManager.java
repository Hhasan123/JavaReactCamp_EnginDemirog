package Ders3;

public class UserManager {
	public void add(User[] users) {
		for (User user : users) {
			System.out.println(user.getE_Mail()+" mail i eklendi.");
		}
	}
	
	public void update(User[] users) {
		for (User user : users) {
			System.out.println(user.getE_Mail()+" mail i guncellendi.");
		}
	}
	
	public void delete(User[] users) {
		for (User user : users) {
			System.out.println(user.getE_Mail()+" mail i silindi.");
		}
	}
}