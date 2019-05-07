package chapter4_2반복문;

public class Break예제 {

	public static void main(String[] args) {
		
		int num;
		int total = 0;
		
		for (num = 0; ; num++) {
			total += num;
			if (total >= 100) break;
		}
		System.out.println("num : " + num);
		System.out.println("total : " + total);
	}

}
