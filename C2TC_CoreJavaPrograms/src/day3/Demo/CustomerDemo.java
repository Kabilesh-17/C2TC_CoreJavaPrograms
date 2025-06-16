package day3.Demo;

public class CustomerDemo {
public static void main(String[] args) {
		
		customer cust = new customer();
		cust.setName("Kabi");
		cust.setId(1503);
		cust.setCity("Chennai");
		System.out.println("Customer Details are.....");
		
		System.out.println(cust.getId());
		System.out.println(cust.getName());
		System.out.println(cust.getCity());
		System.out.println(cust);
	}

}
