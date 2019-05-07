package sorting;

public interface Sort {
	void ascending(int[] arr);
	void descending(int[] arr);
	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
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
		System.out.println("QuickSort 입니다.");
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
		System.out.println("HeapSort 입니다.");
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
		System.out.println("BubbleSort 입니다.");
	}
}




