package classEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass = Class.forName("java.lang.String");
		
		Constructor[] cons = strClass.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println();
		
		Field[] fields = strClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println();
		
		Method [] methods = strClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
		
		System.out.println();
		System.out.println("========================================================");
		System.out.println();
		
		Class pClass = Person.class;
		
		Constructor[] conss = pClass.getConstructors();	//持失切
		for(Constructor c : conss) {
			System.out.println(c);
		}

		System.out.println();
		
		Field[] fieldss = pClass.getFields();
		for(Field f : fieldss) {
			System.out.println(f);
		}
		
		System.out.println();
		
		Method [] methodss = pClass.getMethods();	//五社球
		for(Method m : methodss) {
			System.out.println(m);
		}
	}

}
