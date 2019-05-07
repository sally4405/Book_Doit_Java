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
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");
		
		if(studentLee == studentLee2) 
			System.out.println("studentLee와 studentLee2는 주소 같음");
		else
			System.out.println("studentLee와 studentLee2는 주소 다름");
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2는 동일");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않음");
		
		if(studentLee == studentSang)
			System.out.println("studentLee와 studentSang는 주소 같음");
		else
			System.out.println("studentLee와 studentSang는 주소 다름");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee와 studentSang는 동일");
		else
			System.out.println("studentLee와 studentSang는 동일하지 않음");
	
		System.out.println("studentLee의 HashCode : " + studentLee.hashCode());
		System.out.println("studentSang의 HashCode : " + studentSang.hashCode());
		
		System.out.println("studentLee의 실제 주소값 : " + System.identityHashCode(studentLee));
		System.out.println("studenSang의 실제 주소값 : " + System.identityHashCode(studentSang));
	
	
	}

}
