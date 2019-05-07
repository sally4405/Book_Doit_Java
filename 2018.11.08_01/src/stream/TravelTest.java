package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
	public static void main(String[] args) {
		TravelCustomer cLee = new TravelCustomer("�̼���", 40, 100);
		TravelCustomer cKim = new TravelCustomer("������", 20, 100);
		TravelCustomer cHong = new TravelCustomer("ȫ�浿", 13, 50);
		
		List<TravelCustomer> cList = new ArrayList<>();
		
		cList.add(cLee);
		cList.add(cKim);
		cList.add(cHong);
		
		System.out.println("== �� ��ܿ� �߰��� ������� ��� ==");
		cList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		int total = cList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("�� ���� ����� : " + total + "�Դϴ�.");
		
		System.out.println("== 20�� �̻� �� ��� �����Ͽ� ��� ==");
		cList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		
		
	}

}
