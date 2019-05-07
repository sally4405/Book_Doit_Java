package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer cLee = new Customer(10010, "이순신");
//		cLee.setCustomerID(10010);
//		cLee.setCustomerName("이순신");
		cLee.bonusPoint = 1000;
		System.out.println(cLee.showCustomerInfo());
		
		VIPCustomer cKim = new VIPCustomer(10020, "김유신", 12345);
//		cKim.setCustomerID(10020);
//		cKim.setCustomerName("김유신");
		cKim.bonusPoint = 10000;
		System.out.println(cKim.showVIPInfo());
		
//		Customer vc = new VIPCustomer();
		
		

	}

}
 