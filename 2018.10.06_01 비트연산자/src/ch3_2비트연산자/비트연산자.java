package ch3_2비트연산자;

public class 비트연산자 {

	public static void main(String[] args) {
		
		int num = 0B00000101;
		
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);

		System.out.println(num);
		
		num = num << 2;
		
		System.out.println(num);
		
		
	}

}
