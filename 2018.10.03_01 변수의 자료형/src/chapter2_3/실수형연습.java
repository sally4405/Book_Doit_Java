package chapter2_3;

public class �Ǽ������� {

	public static void main(String[] args) {

		double dnum = 3.14;
		float fnum = 3.14f;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		//�� ���� ��! �ε� �Ҽ��� ����� ����
		
		double num = 1;
		final int MAX_NUM = 10000;
		
		for(int i = 0; i < MAX_NUM; i++) {
			num = num + 0.1;
		}
		
		System.out.println(num);
		
	}

}
