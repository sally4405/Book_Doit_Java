package q4;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dog = new Dog[5];
		
		dog[0] = new Dog("¸Û¸ÛÀÌ", "Ä¡¾Æ¿Í");
		dog[1] = new Dog("»Ç»ß", "Áøµ¾°³");
		dog[2] = new Dog("¼ø½ÉÀÌ", "»ð»ì°³");
		dog[3] = new Dog("Ã¶ÀÌ", "¸¶¸£Æ¼½º");
		dog[4] = new Dog("»ßÂÞ", "Çªµé");	
		
		for(int i = 0; i < dog.length; i++) {
			System.out.println(dog[i].showDogInfo());
		}
		
		for (Dog doggy : dog) {
			System.out.println(doggy.showDogInfo());
		}
		

	}

}
