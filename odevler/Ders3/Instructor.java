package Ders3;

public class Instructor extends User {
	private int instructorsId;
	private String instructorFirstName;
	private String indtructorLastName;
	private String[] instructorsCourses;
	
	
	public int getInstructorsId() {
		return instructorsId;
	}
	public void setInstructorsId(int instructorsId) {
		this.instructorsId = instructorsId;
	}
	public String getInstructorFirstName() {
		return instructorFirstName;
	}
	public void setInstructorFirstName(String instructorFirstName) {
		this.instructorFirstName = instructorFirstName;
	}
	public String getIndtructorLastName() {
		return indtructorLastName;
	}
	public void setIndtructorLastName(String indtructorLastName) {
		this.indtructorLastName = indtructorLastName;
	}
	public String[] getInstructorsCourses() {
		return instructorsCourses;
	}
	
	
	
	
}
