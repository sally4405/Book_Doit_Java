package q5;

public class BeanCoffee {
	int money;
	String order;
	int balance;
	
	public String brewing(String order, int money) {
	
		this.money += money;
		if(order == "BEANAMERICANO") {
			if(money >= Menu.BEANAMERICANO) {
				balance = money - Menu.BEANAMERICANO;
				return "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�. �Ž������� " + balance + "�� �Դϴ�.";
			}
			else {
				return "���� �����մϴ�.";
			}
		}
		else if(order == "BEANLATTE") {
			if(money >= Menu.BEANLATTE) {
				balance = money - Menu.BEANLATTE;
				return "�� �ٹ� �󶼸� �����߽��ϴ�. �Ž������� " + balance + "�� �Դϴ�.";
			}
			else {
				return "���� �����մϴ�.";
			}
		}
		else {
			return "���� �޴��Դϴ�.";
		}
	}
}
