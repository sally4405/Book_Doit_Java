package school;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String studentName;
	private Subject major;
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	
	public Student(int studentID, String studentName, Subject major) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.major = major;
	}
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public Subject getMajor() {
		return major;
	}
	public void setMajor(Subject major) {
		this.major = major;
	}
	
	public ArrayList<Score> getScoreList() {
		return scoreList;
	}
	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
	
	
}
