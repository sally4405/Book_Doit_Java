package object;

public class StringEquals {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
//		String str3 = "tt";
//		String str4 = "tt";
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
//		System.out.println(str3 == str4);
//		System.out.println(str3.equals(str4));
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
	}

}
