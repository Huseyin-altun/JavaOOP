package javainterfaces;

public abstract class CustomerManager implements CustomerService{

	public void save(Customer customer) {
		System.out.println("Veritabanưna kaydedildi "+customer.getFirstName());
		
	}

}
