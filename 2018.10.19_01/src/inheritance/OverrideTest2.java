package inheritance;

public class OverrideTest2 {

	public static void main(String[] args) {
		
		Customer cLee = new Customer(10010, "�̼���");
		cLee.bonusPoint = 1000;
		
		VIPCustomer cKim = new VIPCustomer(10020, "������", 12345);
		cKim.bonusPoint = 10000;

		int price = 10000;
		
		System.out.println(cLee.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + 
							cLee.calcPrice(price) + "���Դϴ�. ");
		System.out.println(cKim.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + 
							cKim.calcPrice(price) + "���Դϴ�. ");
		
		
		
	}

}
