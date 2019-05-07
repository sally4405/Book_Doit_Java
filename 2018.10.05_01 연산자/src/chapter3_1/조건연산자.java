package chapter3_1;

public class 조건연산자 {

	public static void main(String[] args) {

		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
		
		int num = 10;
		String ch2;
		ch2 = (num%2)==0 ? "는(은) 짝수입니다" : "는(은) 홀수입니다";
		System.out.println(num + ch2);
		

	}

}
