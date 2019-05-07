package q5;

public class Person {
	String name;
	int money;
	String order;
	
	Person(String name, int money ){
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee sCoffee, String order, int money) {
		String message = sCoffee.brewing(order, money);
		if(message == "돈이 부족합니다.") {
			this.money = money;
			System.out.println(name + " 씨는 " + message);
		}
		else if(message == "없는 메뉴입니다.") {
			this.money = money;
			System.out.println(name + " 씨가 고른 메뉴는 " + message);
		}
		else {
			this.money -= money;
			System.out.println(name + " 씨는 " + money +"원을 내고 "  + message);
		}
	}
	
	public void buyBeanCoffee(BeanCoffee bCoffee, String order, int money) {
		String message = bCoffee.brewing(order, money);
		if(message == "돈이 부족합니다.") {
			this.money = money;
			System.out.println(name + " 씨는 " + message);
		}
		else if(message == "없는 메뉴입니다.") {
			this.money = money;
			System.out.println(name + " 씨가 고른 메뉴는 " + message);
		}
		else {
			this.money -= money;
			System.out.println(name + " 씨는 " + money +"원을 내고 "  + message);
		}
	}
}
