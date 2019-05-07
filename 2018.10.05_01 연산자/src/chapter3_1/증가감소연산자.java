package chapter3_1;

public class 증가감소연산자 {

	public static void main(String[] args) {
		
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		
		System.out.println(gameScore);
		
		int lastScore3 = gameScore++;
		System.out.println(lastScore3);
		
		int lastScore4 = gameScore--;
		System.out.println(lastScore4);
		
		System.out.println(gameScore);
		
	}

}
