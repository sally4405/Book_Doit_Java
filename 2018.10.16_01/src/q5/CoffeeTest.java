package q5;

public class CoffeeTest {

	public static void main(String[] args) {
	
			Person kim = new Person("Kim", 10000);
			Person Lee = new Person("Lee", 17300);
			StarCoffee starCoffee = new StarCoffee();
			BeanCoffee beanCoffee = new BeanCoffee();
			
			Lee.buyStarCoffee(starCoffee, "STARAMERICANO", 4700);
			kim.buyBeanCoffee(beanCoffee,"BEANLATTE", 4200);

		}

	}


