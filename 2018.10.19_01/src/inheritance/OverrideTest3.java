package inheritance;

public class OverrideTest3 {

	public static void main(String[] args) {
		
		int price = 10000;
		
		Customer cLee = new Customer(10010, "�̼���");
		System.out.println(cLee.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + 
				cLee.calcPrice(price) + "���Դϴ�. ");
		System.out.println(cLee.showCustomerInfo());
		
		VIPCustomer cKim = new VIPCustomer(10020, "������", 12345);
		System.out.println(cKim.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + 
				cKim.calcPrice(price) + "���Դϴ�. ");
		System.out.println(cKim.showCustomerInfo());
		
		Customer vc = new VIPCustomer(10030, "������", 2000);
		System.out.println(vc.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + 
							vc.calcPrice(price) + "���Դϴ�. ");
		System.out.println(vc.showCustomerInfo());
		
		
		
	}

}
