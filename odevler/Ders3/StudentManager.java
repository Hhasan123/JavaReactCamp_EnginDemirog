package Ders3;

public class StudentManager extends UserManager{
	@Override
	public void add(User[] users) {
		for (User user : users) {
			System.out.println(user.getE_Mail()+" mail i ogrenci veritabanına eklendi.");
		}
	}
	
	public void update(User[] users) {
		for (User user : users) {
			System.out.println(user.getE_Mail()+" mail i ogrenci veritabanda guncellendi.");
		}
	}
	
	public void delete(User[] users) {
		for (User user : users) {
			System.out.println(user.getE_Mail()+" mail i ogrenci veritabanından silindi.");
		}
	}
}
