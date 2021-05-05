package Ders4.Odev2.Abstract;

import Ders4.Odev2.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to Db : "+customer.getFirstName());
	}

}
