package demo.Adapters;

import java.rmi.RemoteException;

import demo.Abstract.ICustomerCheckService;
import demo.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MersnisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		boolean result= true;
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()),
			customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),
			customer.getDateOfBirth());
			
		} catch (RemoteException e){
			e.printStackTrace();
		}
		return result;
	}


}
