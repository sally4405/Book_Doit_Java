package q5;

public class StarCoffee {
	int money;
	String order;
	int balance;
	
	public String brewing(String order, int money) {
	
		this.money += money;
		if(order == "STARAMERICANO") {
			if(money >= Menu.STARAMERICANO) {
				balance = money - Menu.STARAMERICANO;
				return "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�. �Ž������� " + balance + "�� �Դϴ�.";
			}
			else {
				return "���� �����մϴ�.";
			}
		}
		else if(order == "STARLATTE") {
			if(money >= Menu.STARLATTE) {
				balance = money - Menu.STARLATTE;
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
