package 연습문제;

public class 연습문제5 {

	public static void main(String[] args) {
		
/* 줄 수를 바꿀 수가 없음
		int line;
		int star;
		int space;
		int i;
		int j;
		
		for (line = 1; line <= 9; line++) {
			if (line <= 4) {
				
				star = 2*line -1;
				space = 4 - line;
				
				for (i = 1; i <= space; i++) {
					System.out.print(" ");
				}
				for (j = 1; j <= star; j++) {
					System.out.print("*");
				}
				for (i = 1; i <= space; i++) {
					System.out.print(" ");
				}
				System.out.println();
			}
			
			else {
				
				star = 15 - 2*line;
				space = line - 4;
				
				for (i = 1; i <= space; i++) {
					System.out.print(" ");
				}
				for (j = 1; j <= star; j++) {
					System.out.print("*");
				}
				for (i = 1; i <= space; i++) {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
*/
		

		int line = 9;
		int space = line/2 + 1;
		int star = 1;
		int i;
		int j;
		
		for (i = 0; i < line; i++) {
			for (j = 0; j < space; j++)
				System.out.print(" ");
			for (j = 0; j < star; j++) {
				System.out.print("*");
			}
			for (j = 0; j < space; j++) {
				System.out.print(" ");
			}
			if (i < line/2) {
				space -= 1;
				star += 2;
			}
			else {
				space += 1;
				star -= 2;
			}
			System.out.println();
		}


		
		
		
	}

}
