package collection.hashset;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<>();
		hashset.add(new String("������"));
		hashset.add(new String("������"));
		hashset.add(new String("ȫ����"));
		hashset.add(new String("������"));
		hashset.add(new String("������"));
		
		System.out.println(hashset);

	}

}
