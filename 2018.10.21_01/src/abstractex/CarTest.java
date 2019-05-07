package abstractex;

abstract class Car {
	public abstract void run();
	public abstract void refuel();
	public void stop() {
		System.out.println("���� ����ϴ�.");
	}
}

class Bus extends Car {
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	@Override
	public void refuel() {
		System.out.println("õ�� ������ �����մϴ�.");
	}	
	public void takePassenger() {
		System.out.println("�°��� ������ �¿�ϴ�.");
	}
}

class AutoCar extends Car {
	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}
	@Override
	public void refuel() {
		System.out.println("�ֹ����� �����մϴ�.");
	}
	public void load() {
		System.out.println("���� �ƽ��ϴ�.");
	}
}

public class CarTest {

	public static void main(String[] args) {
		Bus bus = new Bus();
		AutoCar autocar = new AutoCar();
		
		bus.run();
		autocar.run();
		
		bus.refuel();
		autocar.refuel();
		
		bus.takePassenger();
		autocar.load();
		
		bus.stop();
		autocar.stop();
	}

}
