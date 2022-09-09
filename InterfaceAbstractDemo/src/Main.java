import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entiteis.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager customerManager = new NeroCustomerManager();
		Customer customer = new Customer();
		customer.id = 1;
		customer.firstName = "Alper Enes";
		customer.lastName = "Yavuz";
		customer.dateOfBirth = 2002;
		customer.nationalityId = "13456694409";
		customerManager.Save(customer);
		
		customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(customer);
	}

}
