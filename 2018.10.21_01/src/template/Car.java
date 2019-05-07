package template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnoff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnoff();
	}
/*	
	final public void runn(Car car) {
		car.startCar();
		car.drive();
		car.stop();
		car.turnoff();
	}
*/
}
