package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee = new Person();
		Person personKim = new Person("±Ë¡§∫Û");
		Person personSe = new Person("¿Ãºº¿∫", 156, 42); 
	
		
		personLee.name = "¿Ãº¯Ω≈";
		personKim.height = 170.2f;
		
		System.out.println(personLee.name);
		System.out.println(personLee.weight);
		
		System.out.println(personKim.name);
		System.out.println(personKim.height);
		
		System.out.println(personSe.name);
		System.out.println(personSe.weight);
		System.out.println(personSe.height);

		
	}

}
