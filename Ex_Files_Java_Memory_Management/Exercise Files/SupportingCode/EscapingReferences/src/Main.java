public class Main {

	public static void main(String[] args) {
		CustomerRecords records = new CustomerRecords();

		records.addCustomer(new Customer("John"));
		records.addCustomer(new Customer("Simon"));
		
//		records.getCustomers().clear();
		
		for (CustomerReadOnly next : records.getCustomers().values()) {
			System.out.println(next);
		}
		
//		records.iterator().remove();
		CustomerReadOnly john = records.getCustomerByName("John");
		System.out.println(john.getName());
//		john.setName("Barry");
		System.out.println(john.getName());
		
		for (CustomerReadOnly next : records.getCustomers().values()) {
			System.out.println(next);
		}
	}
	
}
