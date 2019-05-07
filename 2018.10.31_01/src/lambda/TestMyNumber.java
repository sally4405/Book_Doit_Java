package lambda;

@FunctionalInterface
interface MyNumber {
	int getMax(int num1, int num2);
}


public class TestMyNumber {
	public static void main(String[] args) {
		MyNumber mmax = (x, y) -> (x >= y)? x:y;
		System.out.println(mmax.getMax(10, 20));
	
	}

}
