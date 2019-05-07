package chapter4_1조건문;

public class If성적 {

	public static void main(String[] args) {
		
		int score=75;
		char grade;
		
		if (score >= 90) {
			grade = 'A';
		}
		else if (score >= 80) {
			grade = 'B';
		}
		else if (score >= 70) {
			grade = 'C';
		}
		else if (score >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");

	}

}
