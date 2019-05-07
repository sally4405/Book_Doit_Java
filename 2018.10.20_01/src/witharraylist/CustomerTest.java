package witharraylist;
import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer cLee = new Customer(10010, "이순신");
		Customer cShin = new Customer(10020, "신사임당");
		Customer cHong = new GoldCustomer(10030, "홍길동");
		Customer cYoul = new GoldCustomer(10040, "이율곡");
		Customer cKim = new VIPCustomer(10050, "김유신", 12345);
		
		customerList.add(cLee);
		customerList.add(cShin);
		customerList.add(cHong);
		customerList.add(cYoul);
		customerList.add(cKim);
		
		System.out.println("====== 고객 정보 출력 ======");
		
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== 할인율과 보너스 포인트 계산 ======");
		int price = 10000;
		
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.print(customer.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 "
			+ customer.bonusPoint + "점입니다.");

		}

	}

}
