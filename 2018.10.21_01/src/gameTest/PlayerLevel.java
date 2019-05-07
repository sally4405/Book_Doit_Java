package gameTest;

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}

class BeginnerLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}
	@Override
	public void jump() {
		System.out.println("Jump�� �� ������~");
	}
	@Override
	public void turn() {
		System.out.println("Turn�� �� ������~");
	}	
	public void showLevelMessage() {
		System.out.println("*** �ʱ��� ***");
	}
}

class AdvancedLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}
	@Override
	public void jump() {
		System.out.println("���� Jump �մϴ�");
	}
	@Override
	public void turn() {
		System.out.println("Turn�� �� ������~");
	}
	public void showLevelMessage() {
		System.out.println("*** �߱��� ***");
	}
}

class SuperLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("��û ���� �޸��ϴ�.");
	}
	@Override
	public void jump() {
		System.out.println("���� ���� Jump �մϴ�.");
	}
	@Override
	public void turn() {
		System.out.println("�� ���� ���ϴ�.");
	}
	public void showLevelMessage() {
		System.out.println("*** ����� ***");
	}
}