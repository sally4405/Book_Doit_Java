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
				return "별 다방 아메리카노를 구입했습니다. 거스름돈은 " + balance + "원 입니다.";
			}
			else {
				return "돈이 부족합니다.";
			}
		}
		else if(order == "STARLATTE") {
			if(money >= Menu.STARLATTE) {
				balance = money - Menu.STARLATTE;
				return "별 다방 라떼를 구입했습니다. 거스름돈은 " + balance + "원 입니다.";
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
