package chapter4_1���ǹ�;

public class Switch���������� {

	public static void main(String[] args) {
		
		int level = 5;
		String floor;
		
		switch(level) {
		case 1: floor = "�౹";
				break;
		case 2: floor = "�����ܰ�";
				break;
		case 3: floor = "�Ǻΰ�";
				break;
		case 4: floor = "ġ��";
				break;
		default : floor = "�ｺ Ŭ��";
				break;
		}
		
		System.out.println(level + "�� " + floor + "�Դϴ�.");

	}

}
