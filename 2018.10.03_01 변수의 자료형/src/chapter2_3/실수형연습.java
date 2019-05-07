package chapter2_3;

public class 실수형연습 {

	public static void main(String[] args) {

		double dnum = 3.14;
		float fnum = 3.14f;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		//한 걸음 더! 부동 소수점 방식의 오류
		
		double num = 1;
		final int MAX_NUM = 10000;
		
		for(int i = 0; i < MAX_NUM; i++) {
			num = num + 0.1;
		}
		
		System.out.println(num);
		
	}

}
