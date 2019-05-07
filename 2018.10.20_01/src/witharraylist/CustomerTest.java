package witharraylist;
import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer cLee = new Customer(10010, "�̼���");
		Customer cShin = new Customer(10020, "�Ż��Ӵ�");
		Customer cHong = new GoldCustomer(10030, "ȫ�浿");
		Customer cYoul = new GoldCustomer(10040, "������");
		Customer cKim = new VIPCustomer(10050, "������", 12345);
		
		customerList.add(cLee);
		customerList.add(cShin);
		customerList.add(cHong);
		customerList.add(cYoul);
		customerList.add(cKim);
		
		System.out.println("====== �� ���� ��� ======");
		
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== �������� ���ʽ� ����Ʈ ��� ======");
		int price = 10000;
		
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.print(customer.getCustomerName() + " ���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + " ���� ���� ���ʽ� ����Ʈ�� "
			+ customer.bonusPoint + "���Դϴ�.");

		}

	}

}
