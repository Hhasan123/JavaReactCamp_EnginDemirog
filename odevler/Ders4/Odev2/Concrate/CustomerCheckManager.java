package Ders4.Odev2.Concrate;

import Ders4.Odev2.Abstract.CustomerCheckService;
import Ders4.Odev2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return false;

		
	}


}
