package 연습문제;

public class 연습문제3 {

	public static void main(String[] args) {
		
		int dan;
		int time;
		
		for (dan = 2; dan <= 9; dan++) {
			for (time = 1; time <= 9; time++) {
				if (time > dan) break;
				System.out.println(dan + "X" + time + "=" + dan*time);
			}
			System.out.println();
		}
	
/*		
  		int dan;
		int time = 1;
		
		for (dan = 2; dan <= 9; dan++) {
			while (time <= dan) {
				System.out.println(dan + "X" + time + "=" + dan*time);
				time++;
			}
			time = 1;
			System.out.println();
		}
*/		
		
	}

}
