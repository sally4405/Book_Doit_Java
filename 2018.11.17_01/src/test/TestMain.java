package test;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class TestMain {
	School goodSchool = School.getInstance();
	Subject korean;
	Subject math;
	Subject dance;
	
	GenerateGradeReport gradeReport = new GenerateGradeReport();

	public static void main(String[] args) {
		TestMain test = new TestMain();
		
		test.creatSubject();
		test.creatStudent();
		
		String report = test.gradeReport.getReport();
		System.out.println(report);
	}
	
	public void creatSubject() {
		korean = new Subject("국어", Define.KOREAN);
		math = new Subject("수학", Define.MATH);
		dance = new Subject("방송 댄스", Define.DANCE);
		
		dance.setGradeType(Define.PF_TYPE);
				
		goodSchool.addSubject(korean);
		goodSchool.addSubject(math);
		goodSchool.addSubject(dance);
	}
	
	public void creatStudent() {
		Student s1 = new Student(181213, "안성원", korean);
		Student s2 = new Student(181518, "오태훈", math);
		Student s3 = new Student(171230, "이동호", korean);
		Student s4 = new Student(171255, "조성욱", korean);
		Student s5 = new Student(171590, "최태평", math);
		
		goodSchool.addStudent(s1);
		goodSchool.addStudent(s2);
		goodSchool.addStudent(s3);
		goodSchool.addStudent(s4);
		goodSchool.addStudent(s5);
		
		korean.register(s1);
		korean.register(s2);
		korean.register(s3);
		korean.register(s4);
		korean.register(s5);
		
		math.register(s1);
		math.register(s2);
		math.register(s3);
		math.register(s4);
		math.register(s5);
		
		dance.register(s1);
		dance.register(s2);
		dance.register(s3);
		
		addScoreForStudent(s1, korean, 95);
		addScoreForStudent(s1, math, 56);
		addScoreForStudent(s1, dance, 95);
		
		addScoreForStudent(s2, korean, 95);
		addScoreForStudent(s2, math, 95);
		addScoreForStudent(s2, dance, 85);
		
		addScoreForStudent(s3, korean, 100);
		addScoreForStudent(s3, math, 88);
		addScoreForStudent(s3, dance, 55);
		
		addScoreForStudent(s4, korean, 89);
		addScoreForStudent(s4, math, 95);
		
		addScoreForStudent(s5, korean, 85);
		addScoreForStudent(s5, math, 56);
	}
	
	public void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.getStudentID(), subject, point);
		student.addSubjectScore(score);
	}

}
