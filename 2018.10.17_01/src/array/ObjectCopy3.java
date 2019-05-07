package array;

public class ObjectCopy3 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("태백산", "조정래1");
		bookArray1[2] = new Book("태백", "조정래2");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
//		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
	
		System.out.println("=== bookArray1 ===");
		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		
		System.out.println("=== bookArray2 ===");
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		//bookArray1에서 bookArray2로 실제 값이 복사된 것임. 위치가 다름.
		for(int i = 0; i < bookArray1.length; i++) {
			System.out.println(bookArray1[i]);
		}
		for(int i = 0; i < bookArray2.length; i++) {
			System.out.println(bookArray2[i]);
		}
		
	}

}
