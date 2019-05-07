package exception;

class AutoCloseObj implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("���ҽ��� close() �Ǿ����ϴ�");		
	}
	
}

public class AutoCloseTest {
	public static void main(String[] args) {
		try(AutoCloseObj obj = new AutoCloseObj()) {
			throw new Exception();	//���� ���� �߻�
		} catch (Exception e) {
			System.out.println("���� �κ��Դϴ�");
		}
		
		AutoCloseObj obj2 = new AutoCloseObj();	//�ڹ� 9 ���ĺ��� ��������
		try(obj2) {
			throw new Exception();	//���� ���� �߻�
		} catch (Exception e) {
			System.out.println("���� �κ��Դϴ�");
		}

	}

}
