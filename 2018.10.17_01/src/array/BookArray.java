package array;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];

		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("태백산", "조정래1");
		library[2] = new Book("태백", "조정래2");
		library[3] = new Book("태", "조정래3");
		library[4] = new Book("태백산맥5", "조정래4");
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
	}

}
