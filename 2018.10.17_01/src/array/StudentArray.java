package array;

public class StudentArray {

	public static void main(String[] args) {
		
		Student[] stu = new Student[3];
		
		stu[0] = new Student("James");
		stu[1] = new Student("Tomas");
		stu[2] = new Student("Edward");
		
		for (int i = 0; i < stu.length; i++) {
			stu[i].showStudentInfo();
		}
		
		
	}
	

}
