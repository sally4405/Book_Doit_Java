package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student sLee = new Student("이세은");
		sLee.addSubject("국어",100);
		sLee.addSubject("수학",95);
		
		Student sKim = new Student("김정빈");
		sKim.addSubject("국어",70);
		sKim.addSubject("수학",85);
		sKim.addSubject("영어",100);
		
		sLee.showStudentInfo();
		System.out.println("=====================================");
		sKim.showStudentInfo();

	}

}
