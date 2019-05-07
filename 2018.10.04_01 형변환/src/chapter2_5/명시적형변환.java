package chapter2_5;

public class 명시적형변환 {

	public static void main(String[] args) {

		double dnum1 = 1.2;
		float fnum1 = 0.9f;
		
		int inum1 = (int)dnum1 + (int)fnum1;
		int inum2 = (int)(dnum1 + fnum1);
		
		System.out.println(inum1);
		System.out.println(inum2);
		
		
		int a = 10;
		float b = 2.0f;
		int c = (int)(a+b);
		
		System.out.println(c);
		
	}

}
