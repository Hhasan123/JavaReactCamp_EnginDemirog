package inheritance;

public class CustomerManager {
	
	public void Add(Customer customer) {
		System.out.println(customer.getCustomerNumber()+ " kaydedildi.");
	}
    
    public void addMultiple(Customer[] customers) {
    	
    	for (Customer customer : customers) {
			Add(customer);
		}
    	
    }
    
}
