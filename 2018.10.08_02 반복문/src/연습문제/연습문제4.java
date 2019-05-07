package 연습문제;

public class 연습문제4 {

	public static void main(String[] args) {
	
/*
		int line;
		int num;
		
		for (line = 1; line <= 4; line++) {
			for (num = 1; num <= (2*line - 1); num+=2) {
				System.out.println('*');
				System.out.println(' ');
			}
			System.out.println();
		
		
		}
*/
		int line;
		int star; // = 2*line - 1; //1
		int space; // = 4 - line; //3
		int i;
		int j;
		
		for (line = 1; line <= 4; line++) {
			
			star = 2*line - 1;
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
		
		
		
		
/*
 		int lineCount = 4;  
		int spaceCount = lineCount/2 +1;
		int starCount = 1;
		
		for(int i = 0; i<lineCount; i++) {
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			for(int j=0; j<starCount; j++) {
				System.out.print('*');
			}
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			spaceCount-=1;
			starCount+=2;
			System.out.println();
		}
*/		
		
	}

}
