package inheritance;

public class OverrideTest3 {

	public static void main(String[] args) {
		
		int price = 10000;
		
		Customer cLee = new Customer(10010, "이순신");
		System.out.println(cLee.getCustomerName() + " 님이 지불해야 하는 금액은 " + 
				cLee.calcPrice(price) + "원입니다. ");
		System.out.println(cLee.showCustomerInfo());
		
		VIPCustomer cKim = new VIPCustomer(10020, "김유신", 12345);
		System.out.println(cKim.getCustomerName() + " 님이 지불해야 하는 금액은 " + 
				cKim.calcPrice(price) + "원입니다. ");
		System.out.println(cKim.showCustomerInfo());
		
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " + 
							vc.calcPrice(price) + "원입니다. ");
		System.out.println(vc.showCustomerInfo());
		
		
		
	}

}
