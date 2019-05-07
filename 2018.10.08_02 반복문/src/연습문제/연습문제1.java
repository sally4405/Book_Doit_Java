package 연습문제;

public class 연습문제1 {

	public static void main(String[] args) {

		//if 이용
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		int result = 0;
		
		if (operator == '+') {
			result = num1 + num2;
		}
		else if (operator == '-') {
			result = num1 - num2;
		}
		else if (operator == '*') {
			result = num1 * num2;
		}
		else if (operator == '/') {
			result = num1 / num2;
		}
		else {
			System.out.println("연산자 오류");
		}
		System.out.println(result);
		
		//switch 이용
		
		int re = 0;
		
		switch(operator) {
		case '+': re = num1 + num2; break;
		case '-': re = num1 - num2; break;
		case '*': re =  num1 * num2; break;
		case '/': re = num1 / num2; break;
		default : System.out.println("연산자 오류"); break;
		
		}
		System.out.println(re);

	}

}
