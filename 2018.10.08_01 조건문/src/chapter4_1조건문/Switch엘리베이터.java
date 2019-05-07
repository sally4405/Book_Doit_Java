package chapter4_1조건문;

public class Switch엘리베이터 {

	public static void main(String[] args) {
		
		int level = 5;
		String floor;
		
		switch(level) {
		case 1: floor = "약국";
				break;
		case 2: floor = "정형외과";
				break;
		case 3: floor = "피부과";
				break;
		case 4: floor = "치과";
				break;
		default : floor = "헬스 클럽";
				break;
		}
		
		System.out.println(level + "층 " + floor + "입니다.");

	}

}
