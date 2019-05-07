package chapter2_4;

public class 상수사용하기 {

	public static void main(String[] args) {
		
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;	//사용하지 않을 거라면 초기화 하지 않아도 오류는 안남
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);

	}

}
