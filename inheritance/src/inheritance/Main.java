package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin=new IndividualCustomer();
		engin.setCustomerNumber("12345");
		
		
		
		CorporateCustomer hepsiBurada=new CorporateCustomer();
		hepsiBurada.setCustomerNumber("67890");
		
		SendikaCustomer abc=new SendikaCustomer();
		abc.setCustomerNumber("99999");
		
		CustomerManager customerManager=new CustomerManager();
		//customerManager.Add(hepsiBurada);
		//customerManager.Add(engin);
		//customerManager.Add(abc);
		
		Customer[] customers= {engin,hepsiBurada,abc};
		
		customerManager.addMultiple(customers);
	}
	
}
//Bir class ne yapabiliyorsa yalnýzca onlarý yapabilmelidir.
//Bir sýnýf sadece yapabildiklerini barýndýrmalýdýr.
//SOLID- Open Closed Principle (Yeni özellik eklendiginde mevcut kodu degistiremezsin)