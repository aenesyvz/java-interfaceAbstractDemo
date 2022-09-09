package abstracts;

import entiteis.Customer;

public class BaseCustomerManager  implements CustomerService{

	@Override
	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Saved to db : " + customer.getFirstName());
	}
	
}
