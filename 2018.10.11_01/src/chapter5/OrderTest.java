package chapter5;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		order.num = 20180312001l;
		order.id = "abc123";
		order.date = "2018�� 3�� 12��";
		order.name = "ȫ���";
		order.productNum = "PD0345-12";
		order.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + order.num);
		System.out.println("�ֹ��� ���̵� : " + order.id);
		System.out.println("�ֹ� ��¥ : " + order.date);
		System.out.println("�ֹ��� �̸� : " + order.name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + order.productNum);
		System.out.println("��� �ּ� : " + order.address);
				
		
	}

}
