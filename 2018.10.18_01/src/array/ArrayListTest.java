package array;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("xoqor","whwjdfo"));
		library.add(new Book("xoqor1","whwjdfo1"));
		library.add(new Book("xoqor2","whwjdfo2"));
		library.add(new Book("xoqor3","whwjdfo3"));
		library.add(new Book("xoqor4","whwjdfo4"));

		for(int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("=== 향상된 for문 사용 ===");
		for (Book book:library) {
			book.showBookInfo();
		}
	}

}
