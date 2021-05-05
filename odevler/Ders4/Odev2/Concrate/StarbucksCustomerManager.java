package Ders4.Odev2.Concrate;

import Ders4.Odev2.Abstract.BaseCustomerManager;
import Ders4.Odev2.Abstract.CustomerCheckService;
import Ders4.Odev2.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void Save(Customer customer) {

		if(customerCheckService.checkIfRealPerson(customer)) {
			super.Save(customer);
		}
		else
		{
			new Exception("Not a valid person");
		}
	}
}
