package chapter4_2반복문;

public class DoWhile예제 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num ++;
		}
		while(num <= 10);
		
		System.out.println(sum);
		
	}

}
