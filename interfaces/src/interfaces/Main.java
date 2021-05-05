package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers= {new EmailLogger(),new DatabaseLogger(),new FileLoger(),new SmsLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);
//		CustomerManager customerManager2=new CustomerManager(new FileLoger());
//		CustomerManager customerManager3=new CustomerManager(new DatabaseLogger());
//		CustomerManager customerManager4=new CustomerManager(new EmailLogger());
		
		Customer engin=new Customer(1,"Engin","Demirog");
		customerManager.add(engin);
//		customerManager2.add(engin);
//		customerManager3.add(engin);
//		customerManager4.add(engin);
	}

}
