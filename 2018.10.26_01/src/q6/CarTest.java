package q6;

import java.util.HashMap;

class Car {
	String name;
	
	public Car() {}
	public Car(String name ) {
		this.name = name;
	}
}

class CarFactory {
	private static CarFactory instance = new CarFactory();
	HashMap<String, Car> carMap = new HashMap<>();
	
	private CarFactory() {}
		
	public static CarFactory getInstance() {
		if(instance == null) instance = new CarFactory();
		return instance;
	}

	public Car createCar(String carName) {
		if(carMap.containsKey(carName)) {
			return carMap.get(carName);
		}
		Car car = new Car();
		carMap.put(carName, car);
		return car;		
	}	
}

public class CarTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance( );
		
		Car sonata1 = factory.createCar("연수차");
		Car sonata2 = factory.createCar("연수차");
		System.out.println(sonata1);
		System.out.println(sonata2); 
		System.out.println(sonata1 == sonata2); // true
	
		Car avante1 = factory.createCar("승연차");
		Car avante2 = factory.createCar("승연차");
		System.out.println(avante1 == avante2); // true
		System.out.println(sonata1 == avante1); // false

	}

}
