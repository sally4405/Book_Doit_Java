package chapter2_5;

public class ����������ȯ {

	public static void main(String[] args) {
	
		int n=10;
		double dnum=n;
		double a = 1; //1.0 �̶�� �����
		//int b = a; //a�� 1.0�̶�� ����Ǽ� int������ ������ �ȵǴ� ��
		
		System.out.println(dnum);
		System.out.println(a);
		
		
		byte bnum = 10;
		int inum = bnum;
		float fnum = inum;
		long lnum = 12345678962345l;
		float fnum2 = lnum; 
		//float�� 4��Ʈ���� �Ǽ��� �������� ǥ�� ������ �б� ������ long���� ���� ����
		double dnum2;
		dnum2 = fnum + inum;
		
		System.out.println(fnum2);
		System.out.println(dnum2);
		
	}

}
