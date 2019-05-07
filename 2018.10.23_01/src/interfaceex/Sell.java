package interfaceex;

public interface Sell {
	void sell();
	static void pay() {
		System.out.println("돈을 받았습니다.");
	}
	default void order() {
		System.out.println("판매 주문");
	}
}
