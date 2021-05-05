package inheritance2;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		customerManager.Add(new EMailLogger());
		customerManager.Add(new FileLogger());
		customerManager.Add(new DatabaseLogger());
		
	}

}
//Biribirinin alternatifi olan kolar için if komutu yazýlmaz.