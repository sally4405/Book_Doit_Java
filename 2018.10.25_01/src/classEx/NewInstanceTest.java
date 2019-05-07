package classEx;

public class NewInstanceTest {
	@SuppressWarnings({ "rawtypes", "deprecation" })
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("classEx.Person");
		Person person2 = (Person)pClass.newInstance();	//����Ʈ ������ ȣ��
		System.out.println(person2);
		System.out.println(pClass);
				
	}

}
