package q5;

import java.util.HashSet;


class Student {
	private String studentID;
	private String studentName;
	
	public Student() {}
	
	public Student(String studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	@Override
	public int hashCode() {
		return Integer.parseInt(studentID);
	}

	@Override
	public boolean equals(Object arg0) {
		if(arg0 instanceof Student) {
			Student stu = (Student)arg0;
			if(this.studentID == stu.studentID) return true;
			else return false;
		}
		return false;
	}

	public String toString() {
		return studentID + ":" + studentName;
	}
}


public class StudentTest {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();
		
		set.add(new Student("100", "홍길동"));
		set.add(new Student("200", "강감찬"));
		set.add(new Student("300", "이순신"));
		set.add(new Student("400", "정약용"));
		set.add(new Student("100", "송중기"));
		
		System.out.println(set);

	}

}
