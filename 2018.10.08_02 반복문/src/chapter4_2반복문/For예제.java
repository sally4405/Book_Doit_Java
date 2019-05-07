package chapter4_2반복문;

public class For예제 {

	public static void main(String[] args) {
		
		int num;
		int sum;
		
		for(num=1, sum=0; num<=10; num++) {
			sum += num;
		}
		
		System.out.println(sum);
		
		
		int i;
		String hi = "안녕하세요";
		
		for(i = 1; i <= 10; i++) {
			System.out.println(hi + i);
		}

	}

}
