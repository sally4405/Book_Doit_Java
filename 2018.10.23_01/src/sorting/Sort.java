package sorting;

public interface Sort {
	void ascending(int[] arr);
	void descending(int[] arr);
	default void description() {
		System.out.println("���ڸ� �����ϴ� �˰����Դϴ�.");
	}
}

class QuickSort implements Sort {
	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort ascending");
	}
	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort descending");
	}
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort �Դϴ�.");
	}
}

class HeapSort implements Sort {
	@Override
	public void ascending(int[] arr) {
		System.out.println("HeapSort ascending");
	}
	@Override
	public void descending(int[] arr) {
		System.out.println("HeapSort descending");
	}	
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort �Դϴ�.");
	}
}

class BubbleSort implements Sort {
	@Override
	public void ascending(int[] arr) {
		System.out.println("BubbleSort ascending");
	}
	@Override
	public void descending(int[] arr) {
		System.out.println("BubbleSort descending");
	}
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort �Դϴ�.");
	}
}




