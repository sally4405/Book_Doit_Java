package chapter4_2�ݺ���;

public class Continue {

	public static void main(String[] args) {
		
		int num;
		int total = 0;
		
		for (num=1; num <= 100; num++) {
			if(num % 2 == 0) continue; //continue�� ���� ������ �����ϰ� ���������� ���� ��
			total += num;
		}
		System.out.println(total);

		
	}

}
