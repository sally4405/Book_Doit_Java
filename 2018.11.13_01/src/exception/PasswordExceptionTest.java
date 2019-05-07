package exception;

class PasswordException extends Exception {
	public PasswordException(String message) {
		super(message);
	}
}

public class PasswordExceptionTest {
	
	private String password;
		
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordException {
		if(password == null) {
			throw new PasswordException("��й�ȣ�� null�� �� �����ϴ�");
		}
		else if(password.length() < 5) {
			throw new PasswordException("��й�ȣ�� 5�ڸ� �̻����� ������");
		}
		else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("��й�ȣ�� ���ڿ��θ� �̷���� �� �����ϴ�");
		}		
		this.password = password;
	}


	public static void main(String[] args) {
		PasswordExceptionTest test = new PasswordExceptionTest();
		
		String password = null;
		try {
			test.setPassword(password);
			System.out.println("���� ����1");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcd";
		try {
			test.setPassword(password);
			System.out.println("���� ����2");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcde";
		try {
			test.setPassword(password);
			System.out.println("���� ����3");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcde1";
		try {
			test.setPassword(password);
			System.out.println("���� ����4");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
