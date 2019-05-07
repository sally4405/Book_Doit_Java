package arraylist;
import java.util.ArrayList;

public class Student {
	private static int serialNum;
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(String studentName) {
		serialNum++;
		this.studentID = serialNum;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		double ave = 0;
		for (Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("�л� " + studentName + "�� " + s.getName() +" ���� ������ "
								+ s.getScorePoint() + "�� �Դϴ�." );
		}
		ave = total / subjectList.size();
		System.out.println("�л� " + studentName + "�� ������ " + total + "�� �̰�, ��� ������ "
							+ ave + "�� �Դϴ�.");
	}
	
}
