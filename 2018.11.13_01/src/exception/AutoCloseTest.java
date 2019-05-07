package exception;

class AutoCloseObj implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다");		
	}
	
}

public class AutoCloseTest {
	public static void main(String[] args) {
		try(AutoCloseObj obj = new AutoCloseObj()) {
			throw new Exception();	//강제 예외 발생
		} catch (Exception e) {
			System.out.println("예외 부분입니다");
		}
		
		AutoCloseObj obj2 = new AutoCloseObj();	//자바 9 이후부터 가능해짐
		try(obj2) {
			throw new Exception();	//강제 예외 발생
		} catch (Exception e) {
			System.out.println("예외 부분입니다");
		}

	}

}
