package q5;
import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dog = new ArrayList<Dog>();
		
		dog.add(new Dog("�۸���", "ġ�ƿ�"));
		dog.add(new Dog("�ǻ�", "������"));
		dog.add(new Dog("������", "��찳"));
		dog.add(new Dog("ö��", "����Ƽ��"));
		dog.add(new Dog("����", "Ǫ��"));	
		
		for(int i = 0; i < dog.size(); i++) {
			dog.get(i).showDogInfo();
		}
		
		System.out.println("======================");
			
		for(Dog doog : dog) {
			doog.showDogInfo();
		}

	}

}
