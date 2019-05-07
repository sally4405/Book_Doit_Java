package chapter9;

public abstract class Car {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	
	public void washCar() {
		System.out.println("������ �սô�.");
	}

	public void run() {
		start();
		drive();
		stop();
		turnoff();
		washCar();
	}
}


class Sonata extends Car {
	@Override
	public void start() {
		System.out.println("Sonata �õ��� �մϴ�.");
	}
	@Override
	public void drive() {
		System.out.println("Sonata �޸��ϴ�.");
	}
	@Override
	public void stop() {
		System.out.println("Sonata ����ϴ�.");
	}
	@Override
	public void turnoff() {
		System.out.println("Sonata �õ��� ���ϴ�.");
	}
}

class Grandeur extends Car {
	@Override
	public void start() {
		System.out.println("Grandeur �õ��� �մϴ�.");
	}
	@Override
	public void drive() {
		System.out.println("Grandeur �޸��ϴ�.");
	}
	@Override
	public void stop() {
		System.out.println("Grandeur ����ϴ�.");
	}
	@Override
	public void turnoff() {
		System.out.println("Grandeur �õ��� ���ϴ�.");
	}
}

class Avante extends Car {
	@Override
	public void start() {
		System.out.println("Avante �õ��� �մϴ�.");
	}
	@Override
	public void drive() {
		System.out.println("Avante �޸��ϴ�.");
	}
	@Override
	public void stop() {
		System.out.println("Avante ����ϴ�.");
	}
	@Override
	public void turnoff() {
		System.out.println("Avante �õ��� ���ϴ�.");
	}
}

class Genesis extends Car {
	@Override
	public void start() {
		System.out.println("Genesis �õ��� �մϴ�.");
	}
	@Override
	public void drive() {
		System.out.println("Genesis �޸��ϴ�.");
	}
	@Override
	public void stop() {
		System.out.println("Genesis ����ϴ�.");
	}
	@Override
	public void turnoff() {
		System.out.println("Genesis �õ��� ���ϴ�.");
	}
}