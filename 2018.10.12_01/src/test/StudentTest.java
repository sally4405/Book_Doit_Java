package test;

import hiding.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.address = "서울";
//		studentLee.studentName = "이상원";
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
		System.out.println(studentLee.address);
	}
	

}
