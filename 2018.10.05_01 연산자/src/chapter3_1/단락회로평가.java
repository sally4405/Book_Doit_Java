package chapter3_1;

public class 단락회로평가 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); //앞문장이 이미 거짓이어서 i가 바뀌지 않음
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); //앞문장이 이미 참이어서 i가 바뀌지 않음
		
	}

}
