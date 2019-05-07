package collection.hashset;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<>();
		hashset.add(new String("임정순"));
		hashset.add(new String("박현종"));
		hashset.add(new String("홍연의"));
		hashset.add(new String("강감찬"));
		hashset.add(new String("강감찬"));
		
		System.out.println(hashset);

	}

}
