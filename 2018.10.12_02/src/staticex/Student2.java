package staticex;

public class Student2 {
	private static int serialNum = 1000;
	public int studentId;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2() {
		serialNum++;
		studentId = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static int getSerialNum() {
		int i = 10;
//		studentName = "������";
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
	

	
	
}
