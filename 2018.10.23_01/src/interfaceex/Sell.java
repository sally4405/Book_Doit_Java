package interfaceex;

public interface Sell {
	void sell();
	static void pay() {
		System.out.println("���� �޾ҽ��ϴ�.");
	}
	default void order() {
		System.out.println("�Ǹ� �ֹ�");
	}
}
