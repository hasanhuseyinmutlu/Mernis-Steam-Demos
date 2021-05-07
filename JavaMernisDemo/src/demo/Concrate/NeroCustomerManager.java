package demo.Concrate;

import demo.Abstract.BaseCustomerManager;
import demo.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	@Override
	public void save(Customer customer) {
		System.out.println("nero databases saved");
		
	}

	
}
