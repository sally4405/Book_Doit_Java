package inheritance;

public class OverrideTest1 {

	public static void main(String[] args) {
		
		Customer vc = new VIPCustomer(10030, "������", 2000);
		vc.bonusPoint = 1000;
		
		int price = 10000;
		
		System.out.println(vc.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + 
							vc.calcPrice(price) + "���Դϴ�. ");
	
		
		
		
	}

}
