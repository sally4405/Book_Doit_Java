package object;

class Student {
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentID + "," + studentName;
	}

	@Override
	public boolean equals(Object arg0) {
		if(arg0 instanceof Student) {
			Student std = (Student) arg0;
			if(this.studentID == std.studentID)
				return true;
			else return false;
		}
		else return false;
	}

	@Override
	public int hashCode() {
		return studentID;
	}
	
	
	
}

public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "�̻��");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "�̻��");
		
		if(studentLee == studentLee2) 
			System.out.println("studentLee�� studentLee2�� �ּ� ����");
		else
			System.out.println("studentLee�� studentLee2�� �ּ� �ٸ�");
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee�� studentLee2�� ����");
		else
			System.out.println("studentLee�� studentLee2�� �������� ����");
		
		if(studentLee == studentSang)
			System.out.println("studentLee�� studentSang�� �ּ� ����");
		else
			System.out.println("studentLee�� studentSang�� �ּ� �ٸ�");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee�� studentSang�� ����");
		else
			System.out.println("studentLee�� studentSang�� �������� ����");
	
		System.out.println("studentLee�� HashCode : " + studentLee.hashCode());
		System.out.println("studentSang�� HashCode : " + studentSang.hashCode());
		
		System.out.println("studentLee�� ���� �ּҰ� : " + System.identityHashCode(studentLee));
		System.out.println("studenSang�� ���� �ּҰ� : " + System.identityHashCode(studentSang));
	
	
	}

}
