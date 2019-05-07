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
		if(message == "���� �����մϴ�.") {
			this.money = money;
			System.out.println(name + " ���� " + message);
		}
		else if(message == "���� �޴��Դϴ�.") {
			this.money = money;
			System.out.println(name + " ���� �� �޴��� " + message);
		}
		else {
			this.money -= money;
			System.out.println(name + " ���� " + money +"���� ���� "  + message);
		}
	}
	
	public void buyBeanCoffee(BeanCoffee bCoffee, String order, int money) {
		String message = bCoffee.brewing(order, money);
		if(message == "���� �����մϴ�.") {
			this.money = money;
			System.out.println(name + " ���� " + message);
		}
		else if(message == "���� �޴��Դϴ�.") {
			this.money = money;
			System.out.println(name + " ���� �� �޴��� " + message);
		}
		else {
			this.money -= money;
			System.out.println(name + " ���� " + money +"���� ���� "  + message);
		}
	}
}
