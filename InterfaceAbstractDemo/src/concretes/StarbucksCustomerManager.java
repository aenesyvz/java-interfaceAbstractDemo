package concretes;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entiteis.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfReal(customer)) {
			super.Save(customer);
		}else {
			System.out.println("Not a valid person!");
		}
		
		
	}

}
