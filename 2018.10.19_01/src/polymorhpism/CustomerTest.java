package polymorhpism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer cLee = new Customer();
		cLee.setCustomerID(10010);
		cLee.setCustomerName("�̼���");
		cLee.bonusPoint = 1000;
		
		System.out.println(cLee.showCustomerInfo());
		
		Customer cKim = new VIPCustomer(10020, "������", 12345);
		cKim.bonusPoint = 1000;
		
		System.out.println(cKim.showCustomerInfo());
		System.out.println("====== �������� ���ʽ� ����Ʈ ��� ======");
		
		int price = 10000;
		int leePrice = cLee.calcPrice(price);
		int kimPrice = cKim.calcPrice(price);
		
		System.out.println(cLee.getCustomerName() + " ���� " + leePrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(cLee.showCustomerInfo());
		
		System.out.println(cKim.getCustomerName() + " ���� " + kimPrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(cKim.showCustomerInfo());
	}

}
