package chapter5;

public class ManTest {

	public static void main(String[] args) {
		Man James = new Man();
		James.age = 40;
		James.name = "James";
		James.isMarried = true;
		James.children = 3;
		
		System.out.println("���� : " + James.age);
		System.out.println("�̸� : " + James.name);
		System.out.println("��ȥ ���� : " + James.isMarried);
		System.out.println("�ڳ� �� : " + James.children);
		

	}

}
