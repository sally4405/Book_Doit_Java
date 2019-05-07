package exercise;

import java.util.ArrayList;
import java.util.List;

class Book {
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
}


public class LibraryTest {
	public static void main(String[] args) {
		List<Book> bList = new ArrayList<>();
		
		bList.add(new Book("자바", 25000));
		bList.add(new Book("파이썬", 15000));
		bList.add(new Book("안드로이드", 30000));
		
		int total = bList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(total);
		
		bList.stream().filter(c -> c.getPrice() >= 20000).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));

	}

}
