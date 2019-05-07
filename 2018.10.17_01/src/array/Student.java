package array;

public class Student {
	private int studentID;
	private String name;
	private static int serialNum = 1000;
	
	public Student(String name) {
		serialNum++;
		studentID = serialNum;
		this.name = name;
	}
		

	public void showStudentInfo() {
		System.out.println(studentID + "," + name);
	}
	
}
