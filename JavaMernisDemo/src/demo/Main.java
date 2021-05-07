package demo;

import demo.Abstract.BaseCustomerManager;
import demo.Adapters.MersnisServiceAdapter;
import demo.Concrate.StarbucksCustomerManager;
import demo.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1,"Hasan Hüseyin","Mutlu",2002,"18832219004");
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MersnisServiceAdapter());
		
		customerManager.Save(customer);
	}
}
