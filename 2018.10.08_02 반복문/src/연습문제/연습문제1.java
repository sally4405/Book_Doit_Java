package ��������;

public class ��������1 {

	public static void main(String[] args) {

		//if �̿�
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
			System.out.println("������ ����");
		}
		System.out.println(result);
		
		//switch �̿�
		
		int re = 0;
		
		switch(operator) {
		case '+': re = num1 + num2; break;
		case '-': re = num1 - num2; break;
		case '*': re =  num1 * num2; break;
		case '/': re = num1 / num2; break;
		default : System.out.println("������ ����"); break;
		
		}
		System.out.println(re);

	}

}
