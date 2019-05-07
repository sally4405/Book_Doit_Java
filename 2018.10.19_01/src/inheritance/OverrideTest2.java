package inheritance;

public class OverrideTest2 {

	public static void main(String[] args) {
		
		Customer cLee = new Customer(10010, "이순신");
		cLee.bonusPoint = 1000;
		
		VIPCustomer cKim = new VIPCustomer(10020, "김유신", 12345);
		cKim.bonusPoint = 10000;

		int price = 10000;
		
		System.out.println(cLee.getCustomerName() + " 님이 지불해야 하는 금액은 " + 
							cLee.calcPrice(price) + "원입니다. ");
		System.out.println(cKim.getCustomerName() + " 님이 지불해야 하는 금액은 " + 
							cKim.calcPrice(price) + "원입니다. ");
		
		
		
	}

}
