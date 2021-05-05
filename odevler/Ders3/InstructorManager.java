package Ders3;

public class InstructorManager extends UserManager {
	@Override
	public void add(User[] users) {
		for (User user : users) {
			System.out.println(user.getE_Mail()+" mail i egitmen veritaban�na eklendi.");
		}
	}
	
	public void update(User[] users) {
		for (User user : users) {
			System.out.println(user.getE_Mail()+" mail i egitmen veritaban�nda g�ncellendi.");
		}
	}
	
	public void delete(User[] users) {
		for (User user : users) {
			System.out.println(user.getE_Mail()+" mail i egitmen veritaban�ndan silindi.");
		}
	}
}
