package javainterfaces;

public class Main {

	public static void main(String[] args) {
		Customer custom=new Customer(5, "hsyn", "altn");
		CustomerManager customerManager=new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager.save(custom);
	}

}
