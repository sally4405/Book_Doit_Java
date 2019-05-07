package exercise;

interface Calc {
	public int add(int num1, int num2);
}


public class CalcTest{
	public static void main(String[] args) {
		Calc sum = (a, b) -> a+b;
		System.out.println(sum.add(10, 20));

	}


}
