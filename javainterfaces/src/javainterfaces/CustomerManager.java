package javainterfaces;

public abstract class CustomerManager implements CustomerService{

	public void save(Customer customer) {
		System.out.println("Veritabanýna kaydedildi "+customer.getFirstName());
		
	}

}
