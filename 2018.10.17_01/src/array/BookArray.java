package array;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];

		library[0] = new Book("�¹���", "������");
		library[1] = new Book("�¹��", "������1");
		library[2] = new Book("�¹�", "������2");
		library[3] = new Book("��", "������3");
		library[4] = new Book("�¹���5", "������4");
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
	}

}
