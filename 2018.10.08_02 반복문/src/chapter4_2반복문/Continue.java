package chapter4_2반복문;

public class Continue {

	public static void main(String[] args) {
		
		int num;
		int total = 0;
		
		for (num=1; num <= 100; num++) {
			if(num % 2 == 0) continue; //continue는 이후 수행을 생략하고 증감식으로 가게 함
			total += num;
		}
		System.out.println(total);

		
	}

}
