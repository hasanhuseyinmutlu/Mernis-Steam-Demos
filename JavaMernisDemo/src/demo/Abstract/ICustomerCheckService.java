package demo.Abstract;

import demo.Entities.Customer;

public interface ICustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer);

}
