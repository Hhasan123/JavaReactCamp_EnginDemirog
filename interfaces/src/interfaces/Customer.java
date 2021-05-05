package interfaces;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	
	public Customer() {
		
	}

	public Customer(int id, String firsName, String lastName) {
		//super(); Eðer onu inherit eden bir sýnýf varsa o sýnýfýn parametresiz constructor unu calýstýr demek
		//eger parametreli constructor calýstýrýlmak istenirse de parantez icerisine uygun parametreler atanarak calýstýrýlabilir.
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
