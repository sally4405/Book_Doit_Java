package polymorhpism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer cLee = new Customer();
		cLee.setCustomerID(10010);
		cLee.setCustomerName("이순신");
		cLee.bonusPoint = 1000;
		
		System.out.println(cLee.showCustomerInfo());
		
		Customer cKim = new VIPCustomer(10020, "김유신", 12345);
		cKim.bonusPoint = 1000;
		
		System.out.println(cKim.showCustomerInfo());
		System.out.println("====== 할인율과 보너스 포인트 계산 ======");
		
		int price = 10000;
		int leePrice = cLee.calcPrice(price);
		int kimPrice = cKim.calcPrice(price);
		
		System.out.println(cLee.getCustomerName() + " 님이 " + leePrice + "원 지불하셨습니다.");
		System.out.println(cLee.showCustomerInfo());
		
		System.out.println(cKim.getCustomerName() + " 님이 " + kimPrice + "원 지불하셨습니다.");
		System.out.println(cKim.showCustomerInfo());
	}

}
