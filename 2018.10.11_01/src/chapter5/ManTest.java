package chapter5;

public class ManTest {

	public static void main(String[] args) {
		Man James = new Man();
		James.age = 40;
		James.name = "James";
		James.isMarried = true;
		James.children = 3;
		
		System.out.println("나이 : " + James.age);
		System.out.println("이름 : " + James.name);
		System.out.println("결혼 여부 : " + James.isMarried);
		System.out.println("자녀 수 : " + James.children);
		

	}

}
