package test;

import hiding.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.address = "����";
//		studentLee.studentName = "�̻��";
		studentLee.setStudentName("�̻��");
		
		System.out.println(studentLee.getStudentName());
		System.out.println(studentLee.address);
	}
	

}
