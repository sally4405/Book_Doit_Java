package interfaceex;

public interface Buy {
	void buy();
	static void pay() {
		System.out.println("���� �����Ͽ����ϴ�.");
	}
	default void order() {
		System.out.println("���� �ֹ�");
	}
}
