package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student sLee = new Student("�̼���");
		sLee.addSubject("����",100);
		sLee.addSubject("����",95);
		
		Student sKim = new Student("������");
		sKim.addSubject("����",70);
		sKim.addSubject("����",85);
		sKim.addSubject("����",100);
		
		sLee.showStudentInfo();
		System.out.println("=====================================");
		sKim.showStudentInfo();

	}

}
