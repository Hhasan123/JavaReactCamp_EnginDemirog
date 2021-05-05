package Ders3;

public class Main {

	public static void main(String[] args) {
		Student student=new Student();
		student.setE_Mail("student's_email@gmail.com");
		
		Instructor instructor=new Instructor();
		instructor.setE_Mail("instructor's_email@gmail.com");
		
		User[] users= {student,instructor};
		
		
		UserManager userManager=new UserManager();
		userManager.add(users);
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(users);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(users);
		
	}
}
