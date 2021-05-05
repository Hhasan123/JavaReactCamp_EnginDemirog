package Ders4.Odev2;

import Ders4.Odev2.Abstract.BaseCustomerManager;
import Ders4.Odev2.Adapters.MernisServiceAdapter;
import Ders4.Odev2.Concrate.NeroCustomerManager;
import Ders4.Odev2.Concrate.StarbucksCustomerManager;
import Ders4.Odev2.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager baseCustomerManager1=new NeroCustomerManager();
		Customer customer1=new Customer();
		customer1.setFirstName("Hasan");
		customer1.setLastName("Yýldýz");
		customer1.setDateOfBirth(1999);
		customer1.setNationalityId("3*******");
		baseCustomerManager1.Save(customer1);
		
		BaseCustomerManager baseCustomerManager2=new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer2=new Customer();
		customer2.setFirstName("HASAN");
		customer2.setLastName("Yýldýz");
		customer2.setDateOfBirth(1999);
		customer2.setNationalityId("30713477462");
		baseCustomerManager2.Save(customer2);
		
	}

}
