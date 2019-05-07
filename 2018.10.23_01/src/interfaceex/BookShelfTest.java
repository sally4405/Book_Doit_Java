package interfaceex;
import java.util.ArrayList;

class Shelf {
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}

	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}

interface Queue {
	void enQueue(String title);
	String deQueue();
	int getSize();
}

class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}
	@Override
	public String deQueue() {
		return shelf.remove(0);
	}
	@Override
	public int getSize() {
		return getCount();
	}
}


public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("ÅÂ¹Ú»ê¸Æ 1");
		shelfQueue.enQueue("ÅÂ¹Ú»ê¸Æ 2");
		shelfQueue.enQueue("ÅÂ¹Ú»ê¸Æ 3");

		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		System.out.println(shelfQueue.getSize());
		
	}

}






