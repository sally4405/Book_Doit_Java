package q4;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dog = new Dog[5];
		
		dog[0] = new Dog("�۸���", "ġ�ƿ�");
		dog[1] = new Dog("�ǻ�", "������");
		dog[2] = new Dog("������", "��찳");
		dog[3] = new Dog("ö��", "����Ƽ��");
		dog[4] = new Dog("����", "Ǫ��");	
		
		for(int i = 0; i < dog.length; i++) {
			System.out.println(dog[i].showDogInfo());
		}
		
		for (Dog doggy : dog) {
			System.out.println(doggy.showDogInfo());
		}
		

	}

}
