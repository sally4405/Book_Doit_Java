package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer cLee = new Customer(10010, "�̼���");
//		cLee.setCustomerID(10010);
//		cLee.setCustomerName("�̼���");
		cLee.bonusPoint = 1000;
		System.out.println(cLee.showCustomerInfo());
		
		VIPCustomer cKim = new VIPCustomer(10020, "������", 12345);
//		cKim.setCustomerID(10020);
//		cKim.setCustomerName("������");
		cKim.bonusPoint = 10000;
		System.out.println(cKim.showVIPInfo());
		
//		Customer vc = new VIPCustomer();
		
		

	}

}
 