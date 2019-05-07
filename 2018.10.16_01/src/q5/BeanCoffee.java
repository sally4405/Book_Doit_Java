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
				return "콩 다방 아메리카노를 구입했습니다. 거스름돈은 " + balance + "원 입니다.";
			}
			else {
				return "돈이 부족합니다.";
			}
		}
		else if(order == "BEANLATTE") {
			if(money >= Menu.BEANLATTE) {
				balance = money - Menu.BEANLATTE;
				return "콩 다방 라떼를 구입했습니다. 거스름돈은 " + balance + "원 입니다.";
			}
			else {
				return "돈이 부족합니다.";
			}
		}
		else {
			return "없는 메뉴입니다.";
		}
	}
}
