package 연습문제;

public class 연습문제2 {

	public static void main(String[] args) {
		
		int dan;
		int time;
		int re;
		
		for (dan = 2; dan <= 9; dan++) {
			if (dan % 2 != 0 ) continue;
			for (time = 1; time <= 9; time++) {
				re = dan * time;
				System.out.println(dan + "X" + time + "=" + re);
			}
			System.out.println();
		}
		
		
		/* 깃허브에 나온 답
		 
		int dan;
		int times;
		
		for(dan = 2; dan <=9; dan++){
			if (dan %2 != 0) continue;
			for(times = 1; times <=9; times++){
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println();
		}
		
		 */
	}

}
