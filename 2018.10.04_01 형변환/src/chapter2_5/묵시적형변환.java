package chapter2_5;

public class 묵시적형변환 {

	public static void main(String[] args) {
	
		int n=10;
		double dnum=n;
		double a = 1; //1.0 이라고 출력함
		//int b = a; //a가 1.0이라고 저장되서 int형에는 대입이 안되는 듯
		
		System.out.println(dnum);
		System.out.println(a);
		
		
		byte bnum = 10;
		int inum = bnum;
		float fnum = inum;
		long lnum = 12345678962345l;
		float fnum2 = lnum; 
		//float은 4비트지만 실수가 정수보다 표현 범위가 넓기 때문에 long형을 대입 가능
		double dnum2;
		dnum2 = fnum + inum;
		
		System.out.println(fnum2);
		System.out.println(dnum2);
		
	}

}
