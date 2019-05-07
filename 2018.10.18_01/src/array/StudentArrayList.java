package array;
import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> stu = new ArrayList<Student>();
		
		stu.add(new Student("James"));
		stu.add(new Student("Tomas"));
		stu.add(new Student("Edward"));
		
		for(int i = 0; i < stu.size(); i++) {
//			Student stuu = stu.get(i);
//			stuu.showStudentInfo();
			stu.get(i).showStudentInfo();
		}
		
	}

}
