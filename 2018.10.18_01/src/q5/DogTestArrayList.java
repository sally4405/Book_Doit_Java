package q5;
import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dog = new ArrayList<Dog>();
		
		dog.add(new Dog("¸Û¸ÛÀÌ", "Ä¡¾Æ¿Í"));
		dog.add(new Dog("»Ç»ß", "Áøµ¾°³"));
		dog.add(new Dog("¼ø½ÉÀÌ", "»ð»ì°³"));
		dog.add(new Dog("Ã¶ÀÌ", "¸¶¸£Æ¼½º"));
		dog.add(new Dog("»ßÂÞ", "Çªµé"));	
		
		for(int i = 0; i < dog.size(); i++) {
			dog.get(i).showDogInfo();
		}
		
		System.out.println("======================");
			
		for(Dog doog : dog) {
			doog.showDogInfo();
		}

	}

}
