package staticex;

public class Student3 {
	public static int serialNum = 1000;
	public int studentId;
	public String studentName;
	public int grade;
	public String address;
	public int cardNum;
	
	public Student3(String name) {
		this.studentName = name;
		serialNum++;
		studentId = serialNum;
		cardNum = studentId + 100;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
}
