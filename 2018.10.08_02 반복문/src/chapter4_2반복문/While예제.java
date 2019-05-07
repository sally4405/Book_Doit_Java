package chapter4_2반복문;

public class While예제 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while (num <= 10) {
			sum += num;
			num ++;
		}
		System.out.println(sum);
	}

}
