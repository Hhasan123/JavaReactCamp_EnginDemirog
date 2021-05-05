package interfaces;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	
	public Customer() {
		
	}

	public Customer(int id, String firsName, String lastName) {
		//super(); E�er onu inherit eden bir s�n�f varsa o s�n�f�n parametresiz constructor unu cal�st�r demek
		//eger parametreli constructor cal�st�r�lmak istenirse de parantez icerisine uygun parametreler atanarak cal�st�r�labilir.
		this.id = id;
		this.firstName = firsName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firsName) {
		this.firstName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
