package Ders3;

public class InstructorManager extends UserManager {
	@Override
	public void add(User[] users) {
		for (User user : users) {
			System.out.println(user.getE_Mail()+" mail i egitmen veritabanına eklendi.");
		}
	}
	
	public void update(User[] users) {
		for (User user : users) {
			System.out.println(user.getE_Mail()+" mail i egitmen veritabanında güncellendi.");
		}
	}
	
	public void delete(User[] users) {
		for (User user : users) {
			System.out.println(user.getE_Mail()+" mail i egitmen veritabanından silindi.");
		}
	}
}
